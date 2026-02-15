package com.advancefeatures;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AdvancedFeatures {
	public void createTables() throws SQLException {

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "password");
				Statement st = con.createStatement()) {

			st.executeUpdate("CREATE TABLE IF NOT EXISTS books (" + "book_id INT PRIMARY KEY, " + "title VARCHAR(100), "
					+ "author VARCHAR(100), " + "category VARCHAR(50), " + "total_copies INT, "
					+ "available_copies INT)");

			st.executeUpdate("CREATE TABLE IF NOT EXISTS students (" + "student_id INT PRIMARY KEY, "
					+ "student_name VARCHAR(100))");

			st.executeUpdate("CREATE TABLE IF NOT EXISTS borrow_records ("
					+ "record_id INT AUTO_INCREMENT PRIMARY KEY, " + "student_id INT, " + "book_id INT, "
					+ "issue_date DATE, " + "return_date DATE, " + "fine DECIMAL(10,2), " + "status VARCHAR(20))");
		}
	}

	public void issueBook(int studentId, int bookId) throws SQLException {

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb", "root", "password");

		try {
			con.setAutoCommit(false);

			PreparedStatement check = con.prepareStatement("SELECT available_copies FROM books WHERE book_id=?");
			check.setInt(1, bookId);

			ResultSet rs = check.executeQuery();
			if (!rs.next() || rs.getInt(1) <= 0)
				throw new RuntimeException("Book not available");

			PreparedStatement update = con
					.prepareStatement("UPDATE books SET available_copies = available_copies - 1 WHERE book_id=?");
			update.setInt(1, bookId);
			update.executeUpdate();

			PreparedStatement insert = con
					.prepareStatement("INSERT INTO borrow_records(student_id, book_id, issue_date, status) "
							+ "VALUES (?, ?, CURDATE(), 'ISSUED')");
			insert.setInt(1, studentId);
			insert.setInt(2, bookId);
			insert.executeUpdate();

			con.commit();
			System.out.println("Book issued successfully");

		} catch (Exception e) {
			con.rollback();
			System.out.println("Issue failed");
		} finally {
			con.close();
		}
	}

	public void returnBook(int recordId) throws SQLException {

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb", "root", "password");

		try {
			con.setAutoCommit(false);

			PreparedStatement ps = con.prepareStatement("SELECT book_id, DATEDIFF(CURDATE(), issue_date) AS days "
					+ "FROM borrow_records WHERE record_id=?");
			ps.setInt(1, recordId);

			ResultSet rs = ps.executeQuery();
			rs.next();

			int bookId = rs.getInt("book_id");
			int days = rs.getInt("days");

			double fine = (days > 14) ? (days - 14) * 5 : 0;

			PreparedStatement updateRec = con
					.prepareStatement("UPDATE borrow_records SET return_date=CURDATE(), fine=?, status='RETURNED' "
							+ "WHERE record_id=?");
			updateRec.setDouble(1, fine);
			updateRec.setInt(2, recordId);
			updateRec.executeUpdate();

			PreparedStatement updateBook = con
					.prepareStatement("UPDATE books SET available_copies = available_copies + 1 WHERE book_id=?");
			updateBook.setInt(1, bookId);
			updateBook.executeUpdate();

			con.commit();
			System.out.println("Book returned. Fine: ₹" + fine);

		} catch (Exception e) {
			con.rollback();
		} finally {
			con.close();
		}
	}

	public void searchBooks(String author, String category) throws SQLException {

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb", "root", "password");

		String sql = "SELECT * FROM books WHERE 1=1";

		if (author != null)
			sql += " AND author=?";
		if (category != null)
			sql += " AND category=?";

		PreparedStatement ps = con.prepareStatement(sql);

		int i = 1;
		if (author != null)
			ps.setString(i++, author);
		if (category != null)
			ps.setString(i++, category);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.println(
					rs.getString("title") + " | " + rs.getString("author") + " | " + rs.getInt("available_copies"));
		}
		con.close();
	}

}
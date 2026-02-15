package com.transactionmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionManagement {

	private static final String URL = "jdbc:mysql://localhost:3306/mydb";
	private static final String USER = "root";
	private static final String PASS = "password";

	public void createTable() {

		try (Connection con = DriverManager.getConnection(URL, USER, PASS); Statement st = con.createStatement()) {

			String accTable = "CREATE TABLE IF NOT EXISTS accounts (" + "account_id INT PRIMARY KEY, "
					+ "account_holder VARCHAR(20) NOT NULL, " + "balance DECIMAL(10,2) NOT NULL CHECK (balance >= 0))";

			String txnTable = "CREATE TABLE IF NOT EXISTS transactions (" + "txn_id INT AUTO_INCREMENT PRIMARY KEY, "
					+ "from_account INT, " + "to_account INT, " + "amount DECIMAL(10,2) NOT NULL CHECK (amount > 0), "
					+ "txn_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP, " + "status VARCHAR(20), "
					+ "FOREIGN KEY (from_account) REFERENCES accounts(account_id), "
					+ "FOREIGN KEY (to_account) REFERENCES accounts(account_id))";

			st.executeUpdate(accTable);
			st.executeUpdate(txnTable);

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public double checkBalance(int accountId) throws SQLException {

		double balance = 0;

		try (Connection con = DriverManager.getConnection(URL, USER, PASS);
				PreparedStatement ps = con.prepareStatement("SELECT balance FROM accounts WHERE account_id = ?")) {

			ps.setInt(1, accountId);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				balance = rs.getDouble("balance");
			}
		}
		return balance;
	}

	public void transferMoney(int fromAcc, int toAcc, double amount) {

		try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {

			con.setAutoCommit(false);

			// check balance
			PreparedStatement psCheck = con.prepareStatement("SELECT balance FROM accounts WHERE account_id = ?");
			psCheck.setInt(1, fromAcc);

			ResultSet rs = psCheck.executeQuery();
			if (!rs.next() || rs.getDouble(1) < amount) {
				throw new RuntimeException("Insufficient balance");
			}

			// debit
			PreparedStatement psDebit = con
					.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE account_id = ?");
			psDebit.setDouble(1, amount);
			psDebit.setInt(2, fromAcc);
			psDebit.executeUpdate();

			// credit
			PreparedStatement psCredit = con
					.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE account_id = ?");
			psCredit.setDouble(1, amount);
			psCredit.setInt(2, toAcc);
			psCredit.executeUpdate();

			// transaction log
			PreparedStatement psTxn = con.prepareStatement(
					"INSERT INTO transactions(from_account, to_account, amount, status) VALUES (?,?,?,?)");
			psTxn.setInt(1, fromAcc);
			psTxn.setInt(2, toAcc);
			psTxn.setDouble(3, amount);
			psTxn.setString(4, "SUCCESS");
			psTxn.executeUpdate();

			con.commit();
			System.out.println("Money transferred successfully");

		} catch (Exception e) {
			System.out.println("Transfer failed: " + e.getMessage());
		}
	}

	public void transactionHistory(int accountId) throws SQLException {

		try (Connection con = DriverManager.getConnection(URL, USER, PASS);
				PreparedStatement ps = con.prepareStatement(
						"SELECT * FROM transactions WHERE from_account = ? OR to_account = ? ORDER BY txn_time DESC")) {

			ps.setInt(1, accountId);
			ps.setInt(2, accountId);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("from_account") + " -> " + rs.getInt("to_account") + " | "
						+ rs.getDouble("amount") + " | " + rs.getString("status"));
			}
		}
	}
}
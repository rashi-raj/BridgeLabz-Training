import java.util.Scanner;
/*
School Bus Attendance System 🚍
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
● Print total present and absent counts.
*/

public class BusAttendanceSystem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int present=0,absent=0;
		
		String names[] = {"Mike","Hopper","Jonathan","Dustin","Steve","Nancy","Will","Max","Henry","Joyce"};
		
		System.out.println("Attention everyone!!! \nMark your attendance (Present/Absent)");
		
		for(int i=0 ; i<names.length ; i++){
			System.out.print(names[i] + " : " );
			String temp = sc.next();
			if(temp.equalsIgnoreCase("present")){
				present++;
			}else absent++;
		}
		
		System.out.println("Number of Present students : " + present);
		System.out.println("Number of Absent students : " + absent);
		
		System.out.println();
	}
}
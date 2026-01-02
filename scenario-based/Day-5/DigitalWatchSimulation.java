/*
16. Digital Watch Simulation 
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements
*/

import java.util.Scanner;

public class DigitalWatchSimulation{
	
	public static void main(String[] args){
		// Create Scanner object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n-----------------------------------");
        System.out.println("     Digital Watch Simulation   ");
        System.out.println("-----------------------------------");
		
		for(int i=0 ; i<24 ; i++){
			if(i==13) break;
			for(int j=0 ; j<60 ; j++){
				if(i<10){
					System.out.print("0" + i + " : " );
					if(j<10) {
						System.out.print("0" + j );
					}
					else System.out.print(j );
				}
				else {
					System.out.print(i + " : ");
					if(j<10) {
						System.out.print("0" + j );
					}
					else System.out.print(j );
				}
				System.out.println();
			}
		}
		
		// Close scanner stream
		sc.close();
		
	}
}
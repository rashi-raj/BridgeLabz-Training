import java.util.Scanner;

public class ParkingLotGateSystem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int size = 10; 
		int occupied = 0;
		String input = new String();
		
		do{
			if(occupied == size){
				System.out.println("Oops sorry !! Parking lot is full");
				break;
			}
			
			System.out.println("Welcome to Parking Lot Gate System \n----------------------------------\nEnter 1 : Park\nEnter 2 : Show Occupancy\nEnter 3 : Exit Parking lot\nEnter 4 : Exit System");
				
			int choice = sc.nextInt();
			
			if(choice == 4){
                System.out.println("Thank you for visiting our Parking lot <3");
                break;
            }
			
			switch(choice){
				case 1 :  
					System.out.println("Go ahead ! Park in the space available \n");
					occupied++;
					break;
					
				case 2 : 
					System.out.println("Parking lots available : " + (size-occupied));
					System.out.println();
					break;
					
				case 3 :  
					if(occupied==0) System.out.println("There is no vehicle to exit \n");
					else{
						System.out.println("Vehicle exited successfully! \n");
						occupied--;
					}
					break;
					
				default :
					System.out.println("Invalid!! Enter within the given options \n");
					continue;
			}
			
			System.out.println("Do you want to continue (Yes/No) : ");
			input = sc.next();
			
		}while( !input.toLowerCase().equals("no"));
		
	}
}
// Create SpringSeason class to determine spring season
public class SpringSeason{

	// Method to determine spring season 
	public boolean determineSpringSeason(int month, int date){
		if(month == 3 && date >= 20){
			return true;
		}
		else if(month == 4 && date >= 1 && date <= 30 || month == 5 && date >= 1 && date <= 31) {
			return true;
		}
		else if(month == 6 && date <= 20){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		
		int month = Integer.parseInt(args[0]);
		int date = Integer.parseInt(args[1]);
		
		SpringSeason springSeason = new SpringSeason();
		
		// Printing the results
		if(springSeason.determineSpringSeason(month,date)){
			System.out.println("It's a spring season");
		}
		else{
			System.out.println("Not a spring season");
		}
		
	}
}
import java.util.Scanner;

class Pallindrome{
	
	// Method to determine pallindrome
    public static boolean isPalindrome(int x) {
        int copy = x;
        int reverse=0,rem=0;
        while(x>0){
            rem = x%10;
            reverse = reverse*10 + rem; 
            x = x/10;
        }
        return (copy==reverse);
    }
	
	public static void main(String[] args){
		// Create scanner object
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(Pallindrome.isPalindrome(n)){
			System.out.println("Pallindrome");
		}else {
			System.out.println("Not pallindrome");
		}
		
		// Close scanner stream
		sc.close();
	}
}
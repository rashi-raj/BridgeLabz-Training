import java.util.Scanner;

// Create class Pallindrome to check if a given string is a palindrome
public class Pallindrome{

	// Method to reverse the string
	public static String toReverse(String s){
		char arr[] = s.toCharArray();
		int start = 0;
		int end = arr.length-1;
		
		while(start < end){
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		String result = new String(arr);
		
		return result;
	}
	
	// Method to determine pallindrome
	public static boolean pallindrome(String s , String reverse){
		if(reverse.equals(s)) return true;
		return false;
	}

	public static void main(String[] args){
		// Create scanner object
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		String reverse = Reverse.toReverse(s);
		if(Pallindrome.pallindrome(s, reverse)){
			System.out.println("Pallindrome");
		}
		else{
			System.out.println("Not a Pallindrome");
		}
		
		// Close scanner stream
		sc.close();
	}
}
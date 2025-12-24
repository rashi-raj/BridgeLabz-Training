import java.util.Scanner;

// Create class reverse to reverse the string
public class Reverse{

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

	public static void main(String[] args){
		// Create scanner object
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		System.out.println(Reverse.toReverse(s));
		
		// Close scanner stream
		sc.close();
	}
}
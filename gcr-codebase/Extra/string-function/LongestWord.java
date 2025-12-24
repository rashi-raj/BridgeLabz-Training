import java.util.Scanner;

public class LongestWord{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String arr[] = s.split(" ");
		
		int maxLength = 0;
		for(int i=0 ; i<arr.length ; i++){
			if(maxLength < arr[i].length()){
				maxLength = i;
			}
		}
		
		System.out.println(arr[maxLength]);
	}
}
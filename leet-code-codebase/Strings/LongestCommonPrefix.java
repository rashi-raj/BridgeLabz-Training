import java.util.Scanner;
import java.util.Arrays;

class LongestCommonPrefix{
	
	// Method to find longestCommonPrefix
    public String longestCommonPrefix(String[] strs){
        Arrays.sort(strs);
        String s0 = strs[0];
        String s1 = strs[strs.length-1];
        int idx=0;
        while(idx<s0.length() && idx<s1.length()){
            if(s0.charAt(idx) == s1.charAt(idx)){
                idx++;
            } else{
                break;
            }
        }
        return s0.substring(0,idx);
    }
	
	public static void main(String[] args){
		// Create scanner object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give the size array : ");
		int n = sc.nextInt();
		
		String arr[] = new String[n];
		
		System.out.println("Give the elements : ");
		for(int i=0 ; i<n ; i++){
			arr[i] = sc.next();
		}
		
		LongestCommonPrefix obj = new LongestCommonPrefix();
		String ans = obj.longestCommonPrefix(arr);
		
		System.out.println("Result : ");
		System.out.println(ans);
		
		// Close scanner stream
		sc.close();
	}
}

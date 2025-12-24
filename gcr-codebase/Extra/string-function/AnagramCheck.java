import java.util.Scanner;

public class AnagramCheck{
    public static void main(String[] args){

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s1 = sc.nextLine();
        System.out.println("Enter second string:");
        String s2 = sc.nextLine();

        // Remove spaces and convert to lowercase
        s1 = s1.replace(" ", "").toLowerCase();
        s2 = s2.replace(" ", "").toLowerCase();

        // If lengths are different, strings cannot be anagrams
        if (s1.length() != s2.length()) {
            System.out.println("The strings are NOT anagrams.");
            return;
        }

        int[] count = new int[256];

        // Count characters in first string
        for (int i = 0; i < s1.length(); i++){
            count[s1.charAt(i)]++;
        }

        // Reduce count using second string
        for (int i = 0; i < s2.length(); i++){
            count[s2.charAt(i)]--;
        }

        // Check if all counts are zero
        for (int i = 0; i < count.length; i++){
            if (count[i] != 0){
                System.out.println("The strings are NOT anagrams.");
                return;
            }
        }

        System.out.println("The strings are anagrams.");
		
		sc.close();
    }
}

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args){

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s1 = sc.nextLine();

        System.out.println("Enter second string:");
        String s2 = sc.nextLine();

        int minLength = Math.min(s1.length(), s2.length());
        boolean differenceFound = false;

        // Compare characters one by one
        for (int i = 0; i < minLength; i++){

            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            // If characters are different
            if (c1 < c2){
                System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
                differenceFound = true;
                break;
            }
            else if (c1 > c2){
                System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\" in lexicographical order");
                differenceFound = true;
                break;
            }
        }

        // If all compared characters are equal
        if (!differenceFound){

            // Compare lengths if characters matched
            if (s1.length() < s2.length()) {
                System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
            }
            else if (s1.length() > s2.length()) {
                System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\" in lexicographical order");
            }
            else {
                System.out.println("Both strings are equal");
            }
        }
		
		sc.close();
    }
}

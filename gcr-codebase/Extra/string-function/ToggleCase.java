import java.util.Scanner;

public class ToggleCase{
    public static void main(String[] args){

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        char[] result = s.toCharArray();

        // Loop through each character of the string
        for (int i = 0; i < result.length; i++){

            char temp = result[i];

            if (temp >= 'A' && temp <= 'Z'){
                // Convert uppercase to lowercase
                result[i] = (char) (temp + 32);
            }
            else if (temp >= 'a' && temp <= 'z'){
                // Convert lowercase to uppercase
                result[i] = (char) (temp - 32);
            }
        }

        String toggledString = new String(result);

        System.out.println(toggledString);
		
		sc.close();
    }
}

import java.util.Scanner;

// Create YoungestAndTallest class to find the youngest and tallest person
public class YoungestAndTallest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i] + ":");
            age[i] = input.nextInt();

            System.out.println("Enter height of " + names[i] + " (in cm):");
            height[i] = input.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        // Loop to find youngest and tallest
        for (int i = 1; i<3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }

            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("\nYoungest Friend: " + names[youngestIndex]);
        System.out.println("Age: " + age[youngestIndex]);

        System.out.println("\nTallest Friend: " + names[tallestIndex]);
        System.out.println("Height: " + height[tallestIndex] + " cm");

		// Close scanner stream
        input.close();
    }
}

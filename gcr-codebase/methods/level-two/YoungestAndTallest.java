import java.util.Scanner;

// Create YoungestAndTallest class to find the youngest and tallest person
public class YoungestAndTallest{

	public static int findYoungest(int age[]){
		int youngestIndex = 0;

        // Loop to find youngest
        for (int i = 1; i<3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
        }
		
		return youngestIndex;
	}
	
	public static int findTallest(double height[]){
		int tallestIndex = 0;

        // Loop to find tallest
        for (int i = 1; i<3; i++){
            if (height[i] > height[tallestIndex]){
                tallestIndex = i;
            }
        }
		
		return tallestIndex;
	}

    public static void main(String[] args){
		// Create a scanner object
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

        int youngestIndex = findYoungest(age);
        int tallestIndex = findTallest(height);

        System.out.println("\nYoungest Friend: " + names[youngestIndex]);
        System.out.println("Age: " + age[youngestIndex]);

        System.out.println("\nTallest Friend: " + names[tallestIndex]);
        System.out.println("Height: " + height[tallestIndex] + " cm");

		// Close scanner stream
        input.close();
    }
}

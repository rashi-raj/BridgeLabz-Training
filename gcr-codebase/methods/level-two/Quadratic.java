import java.util.Scanner;

// Create Quadratic class to find roots of quadratic equation
public class Quadratic{

    // Method to find roots of quadratic equation
    public static double[] FindRoots(int a, int b, int c){

        double delta = Math.pow(b, 2) - 4 * a * c;

        if(delta > 0){
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};

        }else if (delta == 0){
            double root = -b / (2.0 * a);
            return new double[]{root};

        }else{
            return new double[]{}; 
        }
    }

    public static void main(String[] args){
		// Create a Scanner Object
        Scanner sc = new Scanner(System.in);

		// Get inputs
		System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double[] roots = FindRoots(a, b, c);

        if(roots.length == 2){
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        }else if (roots.length == 1){
            System.out.println("Root: " + roots[0]);
        }else{
            System.out.println("No real roots");
        }

		// Close Scanner stream
        sc.close();
    }
}

import java.util.Scanner;

public class PointOperations{

    // Method to calculate Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2){
	
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }

    // Method to calculate the equation of a line given two points
    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double m, b;
        if (x2 - x1 != 0) { 
            m = (y2 - y1) / (x2 - x1);
            b = y1 - m * x1;
        } else { 
            m = Double.POSITIVE_INFINITY; 
            b = x1; 
        }
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input two points
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        // Calculate and display Euclidean distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Euclidean distance between points: " + distance);

        // Calculate and display line equation
        double[] equation = lineEquation(x1, y1, x2, y2);
        if (equation[0] != Double.POSITIVE_INFINITY) {
            System.out.println("Equation of the line: y = " + equation[0] + "x + " + equation[1]);
        } else {
            System.out.println("Equation of the line: x = " + equation[1]);
        }

        input.close();
    }
}

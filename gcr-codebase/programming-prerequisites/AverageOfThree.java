import java.util.Scanner;
class AverageOfThree {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number : ");
        int num3 = sc.nextInt();

        double average = (num1 + num2 + num3) / 3.0;
        System.out.println("Average is : " + average);
    }
}
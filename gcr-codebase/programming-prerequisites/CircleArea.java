import java.util.Scanner;
class CircleArea{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		int radius = sc.nextInt();
		double area = 22.0/7 * radius * radius;
		System.out.print("Area of the circle is " + area);
	}
}
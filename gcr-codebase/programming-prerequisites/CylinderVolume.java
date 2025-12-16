import java.util.Scanner;
class CylinderVolume{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius : ");
		int radius = sc.nextInt();
		System.out.print("Enter height : ");
		int height = sc.nextInt(); 
		double volume = 22.0/7 * radius * radius * height;
		System.out.print("Volume of cylinder is " + volume);
	}
}
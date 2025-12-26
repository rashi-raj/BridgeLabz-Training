import java.util.Scanner;

public class CoffeeCounter{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        final double GST_RATE = 0.05;

        while(true){

            System.out.print("\nEnter coffee type (Espresso/Cappuccino/Latte) or type 'exit' to stop: ");
            String coffeeType = sc.nextLine();

            if (coffeeType.equalsIgnoreCase("exit")){
                System.out.println("Thank you for visiting Rashi's Cafe");
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            double price = 0;

            switch (coffeeType.toLowerCase()){
                case "espresso":
                    price = 80;
                    break;
                case "cappuccino":
                    price = 120;
                    break;
                case "latte":
                    price = 150;
                    break;
                default:
                    System.out.println("Invalid coffee type!");
                    continue;
            }

            double total = price * quantity;
            double gst = total * GST_RATE;
            double finalBill = total + gst;

            System.out.println("------ Bill Details ------");
            System.out.println("Coffee Type : " + coffeeType);
            System.out.println("Quantity    : " + quantity);
            System.out.println("Base Amount : ₹" + total);
            System.out.println("GST (5%)    : ₹" + gst);
            System.out.println("Total Bill  : ₹" + finalBill);
        }

        sc.close();
    }
}

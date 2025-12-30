import java.util.Scanner;

public class PhoneRechargeSimulator{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double balance = 500; 
        boolean repeat = true;

        while(repeat){

            System.out.println("\nCurrent Balance: Rs " + balance);
            System.out.print("Enter the mobile operator (Airtel / Jio): ");
            String operator = sc.next();

            System.out.print("Enter recharge amount: ");
            double amount = sc.nextDouble();

            if (amount > balance){
                System.out.println("Insufficient Balance");
                continue;
            }

            switch (operator.toLowerCase()){

                case "airtel":
                    System.out.println("---- Airtel Offers ----");
                    System.out.println("1. Data Add-on");
                    System.out.println("2. Data Packs");
                    System.out.println("3. Smartphone Plans");
                    System.out.println("4. True 5G Unlimited");
                    System.out.println("5. Other Plans");
                    System.out.print("Choose plan: ");

                    int choiceAirtel = sc.nextInt();

                    switch (choiceAirtel){
                        case 1:
                            System.out.println("5 GB Data | Valid for 28 days");
                            break;
                        case 2:
                            System.out.println("3 GB/day | Valid for 5 days");
                            break;
                        case 3:
                            System.out.println("Unlimited Calls + 2GB/day");
                            break;
                        case 4:
                            System.out.println("Unlimited 5G Data");
                            break;
                        case 5:
                            System.out.println("Other Special Plans");
                            break;
                        default:
                            System.out.println("Invalid Plan");
                            continue;
                    }
                    break;

                case "jio":
                    System.out.println("---- Jio Offers ----");
                    System.out.println("1. 1.5 GB/day");
                    System.out.println("2. 2 GB/day");
                    System.out.println("3. Unlimited Data");
                    System.out.print("Choose plan: ");

                    int choiceJio = sc.nextInt();

                    switch (choiceJio) {
                        case 1:
                            System.out.println("1.5 GB/day | 28 days");
                            break;
                        case 2:
                            System.out.println("2 GB/day | 28 days");
                            break;
                        case 3:
                            System.out.println("Unlimited Data + Calls");
                            break;
                        default:
                            System.out.println("Invalid Plan");
                            continue;
                    }
                    break;

                default:
                    System.out.println("Invalid Operator");
                    continue;
            }

            balance -= amount;
            System.out.println("Recharge Successful!");
            System.out.println("Remaining Balance: Rs " + balance);

            System.out.print("\nDo you want to recharge again? (yes/no): ");
            String ans = sc.next();

            if (!ans.equalsIgnoreCase("yes")){
                repeat = false;
            }
        }

        System.out.println("\nThank you for using Phone Recharge Simulator");
        sc.close();
    }
}

// Create OTPGenerator utility class
public class OTPGenerator{

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        int otp = (int)(Math.random() * 900000) + 100000;
        return otp;
    }

    // Method to check if all OTPs in the array are unique
    public static boolean areOTPsUnique(int[] otps){

        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++){
                if (otps[i] == otps[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args){

        // Create an array to store 10 OTP numbers
        int[] otps = new int[10];

        // Generate OTPs 10 times
        for (int i = 0; i < otps.length; i++){
            otps[i] = generateOTP();
        }

        // Display generated OTPs
        System.out.println("Generated OTPs:");
        for (int i = 0; i < otps.length; i++) {
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        // Validate uniqueness
        if (areOTPsUnique(otps)) {
            System.out.println("\nAll OTPs are unique.");
        } else {
            System.out.println("\nDuplicate OTPs found.");
        }
    }
}

import java.util.Scanner;

// Create Random4DigitStats class
public class Random4DigitStats{

    // Method to generate array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size){

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            // Generates random 4-digit number (1000 to 9999)
            numbers[i] = (int)(Math.random() * 9000) + 1000;
        }

        return numbers;
    }

    // Method to find average, minimum and maximum
    public static double[] findAverageMinMax(int[] numbers){

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }

        double average = (double) sum / numbers.length;

        return new double[]{average, min, max};
    }

    public static void main(String[] args){

        int size = 5;

        int[] randomNumbers = generate4DigitRandomArray(size);

        System.out.println("Generated 4-digit random numbers:");
        for(int i = 0; i < randomNumbers.length; i++){
            System.out.println(randomNumbers[i]);
        }

        double[] result = findAverageMinMax(randomNumbers);

        System.out.println("\nAverage Value: " + result[0]);
        System.out.println("Minimum Value: " + result[1]);
        System.out.println("Maximum Value: " + result[2]);
    }
}

// Create FootballTeamHeightStats class
public class FootballTeamHeightStats{

    // Method to generate random heights (150 cm to 250 cm)
    public static int[] generateRandomHeights(int size){

        int[] heights = new int[size];

        for (int i = 0; i < size; i++){
            // Generate 3-digit random height between 150 and 250
            heights[i] = (int)(Math.random() * 101) + 150;
        }

        return heights;
    }

    // Method to find sum of heights
    public static int findSum(int[] heights){

        int sum = 0;

        for (int i = 0; i < heights.length; i++){
            sum += heights[i];
        }

        return sum;
    }

    // Method to find mean height
    public static double findMeanHeight(int[] heights){

        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find shortest height
    public static int findShortestHeight(int[] heights){

        int min = heights[0];

        for (int i = 1; i < heights.length; i++){
            if (heights[i] < min) {
                min = heights[i];
            }
        }

        return min;
    }

    // Method to find tallest height
    public static int findTallestHeight(int[] heights){

        int max = heights[0];

        for (int i = 1; i < heights.length; i++){
            if (heights[i] > max){
                max = heights[i];
            }
        }

        return max;
    }

    public static void main(String[] args){

        int size = 11;

        int[] heights = generateRandomHeights(size);

        System.out.println("Heights of players (in cm):");
        for (int i = 0; i < heights.length; i++) {
            System.out.print(heights[i] + " ");
        }

        System.out.println("\n");

        int sum = findSum(heights);
        double mean = findMeanHeight(heights);
        int shortest = findShortestHeight(heights);
        int tallest = findTallestHeight(heights);

        System.out.println("Sum of heights: " + sum);
        System.out.println("Mean height: " + mean);
        System.out.println("Shortest height: " + shortest);
        System.out.println("Tallest height: " + tallest);
    }
}

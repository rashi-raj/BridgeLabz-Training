import java.util.Random;
import java.util.Scanner;

public class MatrixArithmetic{

    // Generate random matrix
    public static int[][] generateMatrix(int rows, int cols){
        Random rand = new Random();
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = rand.nextInt(10); // 0-9
        return mat;
    }

    // Addition
    public static int[][] addMatrices(int[][] A, int[][] B){
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }

    // Subtraction
    public static int[][] subtractMatrices(int[][] A, int[][] B){
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }

    // Multiplication
    public static int[][] multiplyMatrices(int[][] A, int[][] B){
        int rows = A.length, cols = B[0].length, n = B.length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < n; k++)
                    result[i][j] += A[i][k] * B[k][j];
        return result;
    }

    // Display matrix
    public static void displayMatrix(int[][] mat){
        for (int[] row : mat) {
            for (int val : row) System.out.print(val + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args){
		// Create scanner object
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns of matrices: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] A = generateMatrix(rows, cols);
        int[][] B = generateMatrix(rows, cols);

        System.out.println("Matrix A:");
        displayMatrix(A);
        System.out.println("Matrix B:");
        displayMatrix(B);

        System.out.println("A + B:");
        displayMatrix(addMatrices(A, B));
        System.out.println("A - B:");
        displayMatrix(subtractMatrices(A, B));

        if (cols == rows) {
            System.out.println("A * B:");
            displayMatrix(multiplyMatrices(A, B));
        } else {
            System.out.println("Cannot multiply: columns of A != rows of B");
        }
		
		//close scanner stream
		sc.close();
    }
}

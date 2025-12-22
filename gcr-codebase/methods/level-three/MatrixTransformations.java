import java.util.Random;
import java.util.Scanner;

public class MatrixTransformations{

    // Generate random matrix
    public static int[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = rand.nextInt(10); // 0-9
        return mat;
    }

    // Transpose
    public static int[][] transpose(int[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        int[][] t = new int[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                t[j][i] = mat[i][j];
        return t;
    }

    // Determinant of 2x2
    public static int det2x2(int[][] mat){
        return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
    }

    // Determinant of 3x3
    public static int det3x3(int[][] mat){
        return mat[0][0]*(mat[1][1]*mat[2][2]-mat[1][2]*mat[2][1])
             - mat[0][1]*(mat[1][0]*mat[2][2]-mat[1][2]*mat[2][0])
             + mat[0][2]*(mat[1][0]*mat[2][1]-mat[1][1]*mat[2][0]);
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

        System.out.print("Enter rows and columns of matrix: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] mat = generateMatrix(rows, cols);
        System.out.println("Matrix:");
        displayMatrix(mat);

        System.out.println("Transpose:");
        displayMatrix(transpose(mat));

        if (rows == 2 && cols == 2)
            System.out.println("Determinant (2x2): " + det2x2(mat));
        else if (rows == 3 && cols == 3)
            System.out.println("Determinant (3x3): " + det3x3(mat));
        else
            System.out.println("Determinant calculation only for 2x2 or 3x3 matrices");
			
		//close scanner stream
		sc.close();
	}
}

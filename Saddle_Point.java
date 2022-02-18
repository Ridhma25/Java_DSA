import java.util.*;

public class Saddle_Point {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows of the matrix: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns of the matrix: ");
        int columns = sc.nextInt();

        int matrix[][] = new int[rows][columns];

        int n = rows;

        System.out.print("Enter values of the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        Saddle(matrix, n);
    }

    public static boolean Saddle(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {

            int min = matrix[i][0];
            int col = 0;

            for (int j = 1; j < n; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                    col = j;
                }
            }

            int k;
            for (k = 0; k < n; k++) {
                if (min < matrix[k][col]) {
                    break;
                }
            }
                if (k == n) {
                    System.out.print("The saddle point of the matrix is: " + min);
                    return true;
                }
        }
        return false;
    }
}
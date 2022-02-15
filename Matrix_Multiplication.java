import java.util.*;

public class Matrix_Multiplication {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of matrix 1: ");
        int row1 = sc.nextInt();
        System.out.println("Enter the columns of matrix 1: ");
        int column1 = sc.nextInt();

        int matrix1[][] = new int[row1][column1];

        System.out.println("Enter values of the matrix 1: ");

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the rows of matrix 2: ");
        int row2 = sc.nextInt();
        System.out.println("Enter the columns of matrix 2: ");
        int column2 = sc.nextInt();

        int matrix2[][] = new int[row2][column2];

        System.out.println("Enter values of the matrix 2: ");

        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        multiply(row1, column1, row2, column2, matrix1, matrix2);
    }

    public static void multiply(int r1, int c1, int r2, int c2, int[][] matrix1, int[][] matrix2) {
        int mul[][] = new int[r1][c2];

        int sum = 0;

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < r2; k++) {
                    sum = sum + matrix1[i][k] * matrix2[k][j];
                }
                mul[i][j] = sum;
                sum = 0;
            }
        }

        display(mul, r1, c1);

    }

    public static void display(int[][] mul, int r1, int c2) {
        System.out.print("The multiplied matrix is: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(mul[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}

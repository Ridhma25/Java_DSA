import java.util.*;

public class Wave_Traversal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of matrix 1: ");
        int row = sc.nextInt();
        System.out.println("Enter the columns of matrix 1: ");
        int column = sc.nextInt();

        int matrix[][] = new int[row][column];

        System.out.println("Enter values of the matrix 1: ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        display(matrix, row, column);

    }

    public static void display(int[][] matrix, int row, int column) {
        for (int i = 0; i < column; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < row; j++) {
                    System.out.print(matrix[j][i] + "\t");
                }
            } else {
                for (int j = row - 1; j >=0; j--) {
                    System.out.print(matrix[j][i] + "\t");
                }
            }
            System.out.println("\n");
        }
    }
}
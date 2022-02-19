import java.util.*;

public class Rotate_Matrix_90{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows of the matrix: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns of the matrix: ");
        int columns = sc.nextInt();

        int matrix[][] = new int[rows][columns];

        System.out.print("Enter values of the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

            System.out.print("The rotated matrix is: " + "\n");

            Rotate(matrix, rows, columns);
        }

    public static void Rotate(int[][] matrix, int rows, int columns){
        // transpose of matrix
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // swapping the columns 
        for(int i =0; i<rows; i++){
            for(int j = 0; j<columns/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][columns - j - 1];
                matrix[i][columns - j - 1] = temp;
            }
        }

        //for printing
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                System.out.print(matrix[i][j] + " " );
            }
            System.out.print("\n");
        }
    }
}
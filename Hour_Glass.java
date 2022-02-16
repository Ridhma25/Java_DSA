import java.util.*;

public class Hour_Glass{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[6][6];

        int row = 6, column =6;

        System.out.println("Enter the values of the array: ");
        for(int i = 0; i<6; i++){
            for(int j = 0; j<6; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("The maximum sum of hour glass is: ");


        System.out.print(HourGlassSum(arr, row, column));
    }

    public static int HourGlassSum(int[][] arr, int row, int column){
        int sum = 0, i = 0, j = 0, max = Integer.MIN_VALUE;


        for(i = 0; i<row-2; i++){
            for(j = 0; j<column-2; j++){
                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                max = Math.max(max, sum);
            }
        }

        if(sum>max)
        {
            max=sum;
        }

        return max;
           
    }
}

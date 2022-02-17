import java.util.*;

public class Two_Sum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter elements of array: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of target: ");
        int target = sc.nextInt();

        System.out.print("The solution array is: ");
        for(int i: Solution(arr, n, target)){
            System.out.print(i + " ");
        }
    }

    public static int[] Solution(int[] arr, int n, int target){
        int sum = 0; 

        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i] + arr[j] == target)
                    return new int[]{i+1, j+1};
            }
        }
        return new int[]{-1,-1};
     }
}
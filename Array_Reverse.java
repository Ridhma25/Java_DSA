import java.util.*;

public class Array_Reverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();

        System.out.print("Enter the elements of the array : ");

        int arr[] = new int[n];
        
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("The reverse array is: ");
        reverse(arr , n);
        
    }

    public static void reverse(int[] arr, int n){
        for(int i = n-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
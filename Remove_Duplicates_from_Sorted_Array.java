import java.util.*;

public class Remove_Duplicates_from_Sorted_Array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter elements of array: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("The solution array is: ");
        duplicate(arr, n);
    }

    public static void duplicate(int[] arr, int n){
        int count = 0;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    for(int k = j; k<n-1; k++){
                        arr[k] = arr[k+1];
                    }
                    n--;
                    j--;
                }
        }
    }
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
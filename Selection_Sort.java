import java.util.Scanner;

public class Selection_Sort{

    public static void selection_sort(int arr[]){
        int temp;
        for(int i=0; i<=arr.length-1; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void print(int arr[], int n){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array: ");
        int n = sc.nextInt();
        System.out.println("Enter elements of array: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); 
        } 
        selection_sort(arr);
        System.out.println("Sorted Array is: ");
        print(arr, n);
    }
}
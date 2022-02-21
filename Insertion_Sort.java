import java.util.Scanner;

public class Insertion_Sort{

    public static void insertion_sort(int arr[]){
        int temp;
        for(int i=0; i<=arr.length; ++i){
            int key = arr[i];
            int j = i+1;
            while(j>=0 && arr[j] > key){
                arr[i+1] = arr[j];
                j++;
            }
            arr[j+1] = key;
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
        insertion_sort(arr);
        System.out.println("Sorted Array is: ");
        print(arr, n);
    }
}
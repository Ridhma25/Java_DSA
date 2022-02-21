import java.util.Scanner;

public class Merge_Sort{

    public static void merge_sort(int arr[], int arr1[], int arr2[], int n, int m){
        int i = 0, j = 0, k = 0; 
        
        while(i<=n && j<=m){
            if(arr[i]<arr2[j]){
                arr2[k] = arr[i];
                i++;
            }
            else{
                arr2[k] = arr1[j];
                j++;
            }
            k++;
        }

        for(; i<=n; i++){
            arr2[k] = arr[i];
            k++;
        }
        for(; j<=m; j++){
            arr2[k] = arr1[j];
            k++;
        }
    }

    public static void print(int arr2[]){
        for(int i = 0; i<arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array1: ");
        int n = sc.nextInt();
        System.out.println("Enter elements of array1: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); 
        } 

        System.out.println("Enter number of elements of array2: ");
        int m = sc.nextInt();
        System.out.println("Enter elements of array2: ");
        int[] arr1 = new int[m];
        for(int i=0; i<m; i++){
            arr1[i] = sc.nextInt(); 
        } 

        int[] arr2 = new int[m+n];

        merge_sort(arr, arr1, arr2, n, m);
        System.out.println("Sorted Array is: ");
        print(arr2);
    }
}
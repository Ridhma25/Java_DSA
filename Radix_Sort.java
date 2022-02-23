import java.util.Scanner;

public class Radix_Sort{

    public static void count_sort(int arr[], int n, int pos, int max){
        int[] b = new int[n+1];
        int[] count = new int[max+1];

        for (int i = 0; i < max; ++i) {
            count[i] = 0;
          }

        for(int i = 0; i<arr.length; i++){
            ++count[(arr[i]/pos)%10];
        }
        
        for(int i = 1; i<=max; i++){
            count[i] = count[i] + count[i-1];
        }
        for(int i = arr.length-1; i>=0; i--){
            b[--count[(arr[i]/pos)%10]] = arr[i];
        }

        for(int i= 0; i<n; i++){
            arr[i] = b[i];
        }
    }

    public static void radix_sort(int arr[], int n){
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }

        for(int pos = 1; max/pos>0; ){
            count_sort(arr, n, pos, max);
            pos = pos*10;
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

        radix_sort(arr, n);
        System.out.println("Sorted Array is: ");
        print(arr, n);
    }
}
import java.util.*;

public class Left_Rotation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter elements of array: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Number of times you want to rotate: ");
        int d = sc.nextInt();

        System.out.print("Array after left rotation is: ");
        Rotation(arr, n, d);
        Display(arr, n);
    }

    public static void Rotation(int[] arr, int n, int d){
        for(int i = 0; i<d; i++){
            int temp = arr[0];
            for(int j = 0; j<n-1; j++){
                arr[j] = arr[j+1];
            }
            arr[n-1] = temp;
        }
    }

    public static void Display(int[] arr, int n){
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
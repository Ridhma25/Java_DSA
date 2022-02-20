import java.util.*;

public class Sparse_Arrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of string: ");
        int n = sc.nextInt();

        String[] s = new String[n];
        System.out.print("Enter the values in the string: ");
        for(int i= 0; i<n; i++){
            s[i] = sc.next();
        }

        System.out.print("Enter the length of queries: ");
        int n1 = sc.nextInt();

        String[] q = new String[n1];
        System.out.print("Enter the values in the queries: ");
        for(int i= 0; i<n1; i++){
            q[i] = sc.next();
        }

        int[] ans = new int[n1];

        System.out.print("The common count in array is: ");
        Answer(s, n, n1, q, ans);
    }

    public static void Answer(String[] s, int n, int n1, String[] q, int[] ans){
        int count = 0;

        for(int i= 0; i<n1; i++){
            for(int j =0; j<n; j++){
                if(q[i].equals(s[j]))
                    count = count+1;
            }
            ans[i] = count;
            count = 0;
        }

        for(int i = 0; i<n1; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
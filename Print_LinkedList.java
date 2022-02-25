import java.io.*;
import java.util.*;

public class Print_LinkedList{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in linked list: ");
        int N = sc.nextInt();

        LinkedList<String> l = new LinkedList<String>();
        System.out.println("Enter data in the linked list: ");
        for(int i= 0; i<N; i++){
            String data = sc.next();
            l.add(data);
        }

        System.out.println("Linked List elements are: ");
        Print_Linked(N, l);

    }

    public static void Print_Linked(int N, LinkedList<String> l){
        for(int i=0; i<N; i++){
            System.out.print(l.get(i) + " ");
        }
    }
}
import java.util.*;
public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, cap, pos, el;
        System.out.println("Enter Size Of Array");
        cap = sc.nextInt();
        System.out.println("Enter no of element in  Array");
        n = sc.nextInt();
        System.out.println("Enter Pos");
        pos = sc.nextInt();
        System.out.println("Enter element");
        el = sc.nextInt();
        int arr[] = new int[cap];
        System.out.println("Enter Elements Of Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (cap == n) {
            System.out.println("No of elements= "+n);
            return;
        }
        for (int j =n-1; j >= pos - 1; j--) {
            arr[j+1] = arr[j];
        }
        arr[pos - 1] = el;


        System.out.println(" No of elements= "+(n+1));

        for (int i = 0; i < n+1; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}



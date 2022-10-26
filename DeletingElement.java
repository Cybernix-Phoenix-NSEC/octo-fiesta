import java.util.*;
public class DeletingElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,cap,pos;
        System.out.println("Enter Capacity Of Array");
        cap=sc.nextInt();
        System.out.println("Enter Element present ");
        n=sc.nextInt();
        System.out.println("Enter pos of element to be removed");
        pos=sc.nextInt();
        int arr[]=new int[cap];

        //Entering Array Element
        System.out.println("Enter Elements Of Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if(n==0)
            return;
        //  Removing element
        for (int i=pos-1;i<n-1;i++){
            arr[i]=arr[i+1];
        }

        for (int i = 0; i < n-1; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

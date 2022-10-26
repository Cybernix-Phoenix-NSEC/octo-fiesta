import java.util.*;
public class LeftRotateByD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Array Element");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter Element to be shifter");
        int d=sc.nextInt();
        int temp[]=new int[d];

        for(int i=0;i<d;i++)
            temp[i]=arr[i];

        for(int i=d;i<n;i++)
            arr[i-d]=arr[i];

        for(int i=0;i<d;i++)
            arr[n-d+i]=temp[i];


        for(int i=0;i<n;i++)
            System.out.println(arr[i]+" ");
    }
}

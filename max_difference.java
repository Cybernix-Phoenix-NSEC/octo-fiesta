import java.util.*;
public class max_difference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter The Elements of Array");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int rev=0;
        int min=arr[0];
        int dif=arr[1]-arr[0];
        for(int i=1;i<n;i++)
        {
            min=Math.min(min,arr[i]);
            rev=Math.max(arr[i]-min,rev);

        }
        System.out.println(rev);
    }

}

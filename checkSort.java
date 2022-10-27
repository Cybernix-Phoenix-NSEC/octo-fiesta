import java.util.*;
public class checkSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size Of the Array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        boolean b=true;
        System.out.println("Enter Array Elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1])
            {
                b=false;
                break;
            }
            b=true;
        }

        System.out.println("The Array Is sorted= "+b);
    }
}

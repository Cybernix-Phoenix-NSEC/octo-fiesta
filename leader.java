import java.util.*;
public class leader{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int n=sc.nextInt();

        int arr[]=new int[n];
        for (int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        int g=n-1;
        System.out.print("The Leaders are: "+arr[g]+" ");
        for (int i=n-2;i>=0;i--){
            if(arr[i]>arr[g]) {
                g = i;
                System.out.print(arr[g]+ " ");
            }
        }
    }
}
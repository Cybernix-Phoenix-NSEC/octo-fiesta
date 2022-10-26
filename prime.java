import java.util.*;
public class prime {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=in.nextInt();
        int count=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a prime number");
        }
        in.close();
    }
}

import java.util.*;
class goldbach
{
    Scanner ob=new Scanner(System.in);
    int n=0;
    void input()//input a number from user
    {
        System.out.println("Enter a number");
        n=ob.nextInt();
    }
    boolean isPrime(int n)//check whether it is prime or not
    {
        int c=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==0)
        return true;
        else
        return false;
    }
    void check()//check whether it is goldbach number or not
    {
        int a=3;
        int b=0;
        if(n%2==0)
        {
            if(n>9&&n<50)
            {
                while(a<n)
                {
                    b=n-a;
                    if(isPrime(a)&& isPrime(b) && a<=b)
                    {
                        if(a+b==n)
                        System.out.println(a+" + "+b+ " =Goldbach number");
                        else
                        System.out.println("Not a Goldbach number");
                    }
                    a=a+2;
                }
            }
            else
            {
               System.out.println("Invalid input");
            }
        }
        else
        {
             System.out.println("Invalid input");
        }
    }
    void main()
    {
        goldbach ab=new goldbach();
        ab.input();
        ab.isPrime(30);
        ab.check();
    }
}

/* OUTPUT
 Enter a number
30
7 + 23 =Goldbach number
11 + 19 =Goldbach number
13 + 17 =Goldbach number
*/
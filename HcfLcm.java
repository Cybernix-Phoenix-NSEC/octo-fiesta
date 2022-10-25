import java.util.Scanner;
class HcfLcm
{
    int a,b,hcf,lcm;
    HcfLcm()
    {
        a=0;
        b=0;
        hcf=1;
        lcm=0;
    }
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        a=sc.nextInt();
        System.out.println("Enter the second number");
        b=sc.nextInt();
    }
    void change()
    {
        if(a>b)
        {
            a=b;
            b=a;
        }
    }
    int rechcf(int p, int q)
    {
        if(p==0)
        return q;
        else
        return rechcf(q%p,p);
    }
    int fn_lcm(int a, int b,int c)
    {
        return (a*b)/c;
    }
    void result()
    {
        hcf= rechcf(a,b);
        lcm=fn_lcm(a,b,hcf);
        System.out.println("HCF of these numbers "+hcf);
        System.out.println("LCM of these mumbers "+lcm);    
    }
}
/*OUTPUT
 * Enter the first number
4
Enter the second number
6
HCF of these numbers 2
LCM of these mumbers 12
 */
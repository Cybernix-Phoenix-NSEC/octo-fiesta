import java.util.*;  
class uniquenumber 
{  
   void main()  
    {  
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter the number");  
        int num=sc.nextInt(); 
        String str= Integer.toString(num);   
        int l=str.length();  
        int flag=0, i, j; 
        if(num<0)
        System.out.println("Invalid Input ");
        else
        {
        for(i=0;i<l-1;i++)  
        {  
            for(j=i+1;j<l;j++)  
            {         
                if(str.charAt(i)==str.charAt(j))   
                {   
                    flag=1;  
                    break;   
                }  
            }  
        }   
        if(flag==0)  
            System.out.println("The number is unique.");  
        else  
            System.out.println("The number is not unique.");  
        }
    }  
}  
/* OUTPUT
 1) Enter the number
    234567892
    The number is not unique.
 2) Enter the number
    234
    The number is unique.
 3) Enter the number
    -23456
    Invalid Input 
 4) Enter the number
    002340
    Invalid Input
 5) Enter the number
    23400
    Invalid Input
*/
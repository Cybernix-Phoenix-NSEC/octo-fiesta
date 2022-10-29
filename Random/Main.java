
/*
 *The driver Code
*/

import java.util.*;

class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x=1;
		
		while(x==1)
		{
		int n=10000;
		
		Random rn=new Random(45.3440015669);
		
		
		for(int i=0;i<n;i++)
		{
		int num=(int)rn.next(10);
		System.out.print(num+1+", ");
		rn.seed(num);
		}
		x=sc.nextInt();
		}
		
	}
	
}

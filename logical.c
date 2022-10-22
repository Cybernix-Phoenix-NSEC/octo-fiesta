	#include<stdio.h>
	
	 int main()
	{
	int y,x=6;                                 //NOT  !     Highest priority     unary operator
	y= x>3||x<4;                              // AND &&                          binary operator
	printf("%d",y); 				         // OR   ||      Lowest priority     binary operator
	return 0;}
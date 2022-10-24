	// sizeof() tells the size of data type,variable or constant in bits
	
	#include<stdio.h>
	
	int main()
	{
	int x,y,z;
	x=sizeof(34);
	y=sizeof(4.35);    // real constant = double data type
	z=sizeof('a');    // ASCII a = 97 each character has a value from 0 to 255 
	printf("%d %d %d",x,y,z);
	return 0;
	}
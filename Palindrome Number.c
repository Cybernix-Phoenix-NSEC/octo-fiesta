#include<stdio.h>
int main(){
	int num,rem,sum=0,temp;
	printf("Enter a number:");
	scanf("%d",&num);
	temp=num;
	while(num>0){
		rem=num%10;
		sum=(sum*10)+rem;
		num=num/10;
	}
	if(temp==sum){
		printf("%d is a palindrome number.",temp);
	}else{
		printf("%d is not a palindrome number.",temp);
	}
	return 0;
}

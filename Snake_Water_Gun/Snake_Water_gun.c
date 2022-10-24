#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int SnakeWaterGun(char you,char comp){
	//return 0 for draw,-1 for lose,1 for win
	if(you==comp){
		return 0;
	}
	if(you=='s' && comp=='g'){
		return -1;
	}
	else if(you=='g' && comp=='s'){
		return 1;
	}
	if(you=='w' && comp=='s'){
		return -1;
	}
	else if(you=='s' && comp=='w'){
		return 1;
	}
	if(you=='g' && comp=='w'){
		return -1;
	}
	else if(you=='w' && comp=='g'){
		return 1;
	}
}


int main()
{
	char you,comp,num;
	srand(time(0));
	num = rand()%100 +1;
	if(num<33){
		comp='s';
	}
	else if(num>=33 && num<66){
		comp='w';
	}
	else{
		comp='g';
	}
	printf("Enter 's' for snake,'w' for water and 'g' ' for gun: ");
	scanf("%c",&you);
	int result = SnakeWaterGun(you,comp);
	printf("You chose %c and computer chose %c.\n",you,comp);
	if(result==0){
		printf("It's a draw!\n");
	}
	else if(result==1){
		printf("You win!\n");
	}
	else {
		printf("You lose!\n");
	}
	return 0;
}
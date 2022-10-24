#include<stdio.h>
typedef struct{
	int weight,value;
	float ratio;
}Items;

void knapsack(Items item[], int n)
{
	int i=n-1,m;
	printf("Enter the capacity of knapsack: ");
	scanf("%d",&m);
	float max_profit = 0.0;
	while(m!=0)
	{
		if(m >= item[i].weight){
			max_profit += (float)item[i].value;
			m -= item[i].weight;
		}
		else{	
			max_profit += ((float)m / (float)item[i].weight) * (float)item[i].value;
			m = 0;
		}
		i--;
	}
	printf("Maximum profit: %.2f", max_profit);
}

void sort(Items item[], int n)
{
	int i,j;
	Items temp;
	for(i=0;i<n;i++)
	item[i].ratio = (float)item[i].value/(float)item[i].weight;
	for(i = 1 ; i < n; i++){
	    j = i;
	    while ( j > 0 && item[j-1].ratio > item[j].ratio){	
		    temp = item[j];        
            item[j] = item[j-1];
            item[j-1] = temp;
            j--;
        }
	}
	knapsack(item,n);
}

void main()
{
	int i,n;
	Items item[100];
	printf("Enter the no. of items: ");
	scanf("%d",&n);
	printf("Enter the weight and value of %d items:\n",n);
	for(i = 0; i < n; i++)
	{
		printf("Weight[%d]:  ", i);
        scanf("%d", &item[i].weight);
        printf("Value[%d]:   ", i);
        scanf("%d", &item[i].value);
	}
	sort(item,n);	
}
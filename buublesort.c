#include<stdio.h>

void main()
{
    int a[10],i,j,temp;
    printf("enter array elements\n");
    for(i=0;i<10;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<9;i++)
    {
        for(j=0;j<9;j++)
        {
            if(a[j]<a[j+1])      //decsending order for asscending a[j+1]<a[j]
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
    printf("In sorted array\n");
    for(i=0;i<10;i++)
    {
        printf("%d\t",a[i]);
    }
}
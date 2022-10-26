#include<stdio.h>

int main() {
    printf("Enter the value of n : ");
    int n,sum=0;
    scanf("%d",&n);
    for(int i=1,j=n; i<=n,j>=1;i++,j--){
        sum+=i;
        printf("%d ",j);
    }
    printf("\nSum is %d",sum);
    return 0;
}

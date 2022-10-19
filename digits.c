#include <stdio.h>
int main()
{
    int n, d, c = 0;
    printf("Enter a number: ");
    scanf("%d", &n);
    while (n != 0)
    {
        d = n % 10;
        c++;
        n /= 10;
    }
    printf("The number of digits = %d", c);

    return 0;
}
#include <stdio.h>

int main(void) {
	// your code goes here
	int n, reversedNumber = 0, remainder;

    scanf("%d", &n);

    while(n != 0)
    {
        remainder = n%10;
        reversedNumber = reversedNumber*10 + remainder;
        n /= 10;
    }

    printf("%d", reversedNumber);
	return 0;
}

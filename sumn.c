#include <stdio.h>

int main(void) {
	// your code goes here
	int n,sum=0,a;
	scanf("%d",&n);
	while(n!=0)
	{
		a=n%10;
		sum=sum+a;
		n=n/10;
	}
	printf("%d",sum);
	return 0;
}

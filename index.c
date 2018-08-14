#include <stdio.h>

int main(void) {
	// your code goes here
	int arr[10],i,n;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
		printf("\n%d %d",arr[i],i);
	}
	return 0;
}

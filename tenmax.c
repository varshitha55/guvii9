#include <stdio.h>

int main(void) {
	// your code goes here
	int a[20],i,temp;
	for(i=1;i<=10;i++)
	{
		scanf("%d",&a[i]);
	}
	temp=a[1];
	for(i=1;i<=10;i++)
	{
		if(temp<a[i])
		{
			temp=a[i];
		}
	}
	printf("%d",temp);
	return 0;
}

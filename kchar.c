#include <stdio.h>

int main(void) 
{
	char str[20];
	int k,i;
	scanf("%s %d",str,&k);
	for(i=0;i<k;i++)
	{
		printf("%c",str[i]);
	}
	return 0;
}

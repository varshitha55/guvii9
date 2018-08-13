#include <stdio.h>

int main(void) {
	// your code goes here
	char str[50],i,c=0;
	gets(str);
	for(i=0;str[i]!='\0';i++)
	{
		if((str[i]>='0')&&(str[i]<='9'))
		{
			c++;
		}
	}
	printf("%d",c);
	return 0;
}

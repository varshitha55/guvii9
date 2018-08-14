#include <stdio.h>
int main(void) {
	int min;
	int h,m;
	scanf("%d",&min);
	h=min/60;
	m=min%60;
	printf("%d",h);
	if(min%60==0)
	{
	printf(" 0" );
	}
	else
	printf(" %d",m);
	return 0;
}

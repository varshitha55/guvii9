#include<stdio.h>
int main()
{
int a,b,c;
scanf("%d",&a);
scanf("%d%d",&b,&c);
if(a>b&&a<c)
{
	printf("yes");
}
else
{
	printf("no");
}
return 0;
}

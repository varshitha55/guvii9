#include <stdio.h>

int main(void) {
	// your code goes here
	int n,a,d,s;
	int N,D,A,S;
	scanf("%d",&n);
	scanf("%d",&a);
	scanf("%d",&d);
	N=n-1;
	D=N*d;
	A=2*a;
	S=A+D;
	s=S*n/2;
	printf("\n%d",s);
	return 0;
}

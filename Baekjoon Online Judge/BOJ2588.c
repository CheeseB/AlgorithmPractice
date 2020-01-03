#include <stdio.h>

int main(){
	
	int a, b, n3, n4, n5, n6;
	
	scanf("%d",&a);
	scanf("%d",&b);
	
	n3 = a * (b%10);
	n4 = a * ((b/10)%10);
	n5 = a * (b/100);
	n6 = a * b;
	
	printf("%d\n",n3);
	printf("%d\n",n4);
	printf("%d\n",n5);
	printf("%d\n",n6);
	
	return 0;
}

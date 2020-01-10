#include <stdio.h>
#include <stdlib.h>
#define _CRT_SECURE_NO_WARNINGS

int main(){
	
	int a,b,c,i,num,arr[10];
	
	for(i=0; i<10; i++) arr[i] = 0;
	
	scanf("%d %d %d",&a,&b,&c);
	num = a*b*c;
	
	i=10;
	do{
		
		arr[num%i]++;
		num = num/i;
		
	}while(num);
	
	for(i=0; i<10; i++) printf("%d\n",arr[i]);
	
	return 0;
}

#include <stdio.h>

int main(){
	
	int a,b,c,i,num;
	int arr[10] = {0};
	
	scanf("%d %d %d",&a,&b,&c);
	num = a*b*c;
	
	i=10;
	while(num){
		arr[num%i]++;
		num = num/i;
	}
	
	for(i=0; i<10; i++) printf("%d\n",arr[i]);
	
	return 0;
}

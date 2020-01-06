#include <stdio.h>

int main(){
	
	int arr[3];
	int i,j, temp;
	
	scanf("%d %d %d",&arr[0],&arr[1],&arr[2]);
	
	for(j=0; j<3; j++)
		for(i=0; i<2; i++)
			if(arr[i]>arr[i+1]){
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
	
	printf("%d",arr[1]);
	
	return 0;
}

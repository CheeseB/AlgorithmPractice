#include <stdio.h>

int main(){
	
	int i,arr[8],asc,des;
	asc = 0;
	des = 0;
	
	for(i=0; i<8; i++){
		scanf("%d",&arr[i]);
	}
	
	for(i=0; i<4; i++){
		if(arr[i] == i+1 && arr[7-i] == 8-i) asc++;
		if(arr[i] == 8-i && arr[7-i] == i+1) des++;
	}
	
	if(asc == 4) printf("ascending");
	else if(des == 4) printf("descending");
	else printf("mixed");
	
	return 0;
}

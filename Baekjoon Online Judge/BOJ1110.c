#include <stdio.h>

int main(){
	
	int first,next,left,right,sum,ans;
	scanf("%d",&first);
	next = first;
	ans = 0;
	
	while(1){
		ans++;
		left = next/10;
		right = next%10;
		sum = left+right;
		next = right*10 + sum%10;
		
		if(next == first) break;
	}
	
	printf("%d",ans);
	
	return 0;
}

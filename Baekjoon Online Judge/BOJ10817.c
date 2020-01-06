#include <stdio.h>

int main(){
	
	int a,b,c,ans;
	
	scanf("%d %d %d",&a,&b,&c);
	
	if(a<=b){
		if(b<=c) ans = b;
		else{
			if(a<=c) ans = c;
			else ans = a;
		}
	}
	else{
		if(a<=c) ans = a;
		else{
			if(b<=c) ans = c;
			else ans = b; 
		}
	}
	
	printf("%d",ans);
	
	return 0;
}

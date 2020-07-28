#include <stdio.h>

int main(){
	
	int x=0 ,y=0 ,w=0 ,h=0;
	int distx, disty, dist = 0;
	
	scanf("%d %d %d %d",&x, &y, &w, &h);
	
	if(x<(w-x)) distx = x;
	else distx = w-x;
	
	if(y<(h-y)) disty = y;
	else disty = h-y;
	
	if(distx<disty) dist = distx;
	else dist= disty;
	
	printf("%d",dist);
	
	return 0;
}

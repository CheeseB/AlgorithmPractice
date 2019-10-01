#include <stdio.h>

int main(){
	int i,n,m, count=0, push=0, num=1;
	
	int sit[5000];
	int josep[5000]; 
	for(i=0;i<5000;i++){
		sit[i]=0;
		josep[i]=0;
	}
	
	scanf("%d %d",&n,&m);
	for(i=0;i<n;i++) sit[i]=i+1;
	
	while(push<n){
		if(count>n-1) count=count%n;
		if(sit[count]==0) count++;
		else{
			if(num==m){
				josep[push]=sit[count];
				sit[count]=0;
				push++;
				count++;
				num=1;
			}
			else{
				count++;
				num++;
			}
		}
	}
	
	printf("<");
	for(i=0;i<n-1;i++) printf("%d, ",josep[i]);
	printf("%d>",josep[n-1]);
	
	return 0;
}

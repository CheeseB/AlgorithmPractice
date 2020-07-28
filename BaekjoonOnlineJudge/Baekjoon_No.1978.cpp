#include <iostream>

using namespace std;

int main(){
	
	int i, j, yac;
	int n = 0, count = 0;
	int num[100] = {};
	
	cin >> n;
	for(i=0; i<n; i++)
		cin >> num[i];
	
	for(i=0; i<n; i++){
		yac = 1;
		for(j=2; j<num[i]; j++)
			if(num[i]%j==0) yac = j;
			
		if(num[i]!=1 && yac==1) count++;
	}
	
	cout << count;
	
	return 0;
}

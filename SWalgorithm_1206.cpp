#include <iostream>

using namespace std;

int main(){
	
	int building[10][1001]; 
	int i,j;
	
	/*�׽�Ʈ���̽� �Է�*/
	for(i=0; i<10; i++){
		cin >> building[i][0]; //�ǹ� �� 
		for(j=1; j<=building[i][0]; j++){
			cin >> building[i][j]; //�� �ǹ� ���� 
		}
	}
	
	
	
	return 0;
}

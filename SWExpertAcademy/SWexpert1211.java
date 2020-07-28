package practice;

import java.util.Scanner;

public class SWexpert1211 {
 
    public static void main(String[] args) {
     
    	Scanner scan = new Scanner(System.in);
    	
    	int n, i, j;
    	int direct, count, min, going;
    	int[][] ladder = new int[100][100];
    	int[] answer = new int[10];
    	
    	for(n=0; n<10; n++) {
    		
    		//�׽�Ʈ ���̽� ��ȣ �Է�
    		scan.nextInt();
    		
    		//��ٸ� �迭 �� �Է� �ޱ�
    		for(i=0; i<100; i++)
    			for(j=0; j<100; j++)
    				ladder[i][j] = scan.nextInt();
    		
    		min = 100000;
    		
    		//����� �ȱ�
    		for(i=0; i<100; i++) {
    			if(ladder[0][i] == 1) going = i;
    			else continue;
    			
    			count = 0;
    			
    			//�ִܰ�� Ž��
        		j = 0;
        		direct = 0;
        		while(j < 99) {
        			
        			if(direct == 0) { //�Ʒ��� ���� ��
        				
        				if(going != 0 && ladder[j][going-1] == 1) {
        					going -=1;
        					direct = 1;
        				}
        				else if(going != 99 && ladder[j][going+1] == 1) {
        					going +=1;
        					direct = 2;
        				}
        				else j++;
        				
        			}
        			
        			else if(direct == 1) { //�������� ���� ��
        				
        				if(going != 0 && ladder[j][going-1] == 1) going -=1;
        				else {
        					j++;
        					direct = 0;
        				}
        				
        			}
        			
        			else if(direct == 2){ //���������� ���� ��
        				
        				if(going != 99 && ladder[j][going+1] == 1) going +=1;
        				else {
        					j++;
        					direct = 0;
        				}
        			}
        			
        			count++;
        			
        		}
        		
        		if(count <= min) {
        			min = count;
        			answer[n] = i;
        		}
    			
    		}

    	}
    	
    	for(n=0; n<10; n++) System.out.println("#"+(n+1)+" "+answer[n]);
    	
    }
}
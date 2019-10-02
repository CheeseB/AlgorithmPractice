package practice;

import java.util.Scanner;

public class SWexpert1210 {
 
    public static void main(String[] args) {
     
    	Scanner scan = new Scanner(System.in);
    	
    	int n, i, j;
    	int direct, going = 0;
    	int[][] ladder = new int[100][100];
    	int[] answer = new int[10];
    	
    	for(n=0; n<10; n++) {
    		
    		//테스트 케이스 번호 입력
    		scan.nextInt();
    		
    		//사다리 배열 값 입력 받기
    		for(i=0; i<100; i++)
    			for(j=0; j<100; j++)
    				ladder[i][j] = scan.nextInt();
    		
    		//마지막 도착지점 찾기
    		for(j=0; j<100; j++)
    			if(ladder[99][j] == 2) {
    				going = j;
    				break;
    			}
    		
    		//도착지점 바로 위로부터 거슬러 올라가기
    		i = 98;
    		direct = 0;
    		while(i > 0) {
    			
    			if(direct == 0) { //위쪽으로 가던 중
    				
    				if(going != 0 && ladder[i][going-1] == 1) {
    					going -=1;
    					direct = 1;
    				}
    				else if(going != 99 && ladder[i][going+1] == 1) {
    					going +=1;
    					direct = 2;
    				}
    				else i--;
    				
    			}
    			
    			else if(direct == 1) { //왼쪽으로 가던 중
    				
    				if(going != 0 && ladder[i][going-1] == 1) going -=1;
    				else {
    					i--;
    					direct = 0;
    				}
    				
    			}
    			
    			else if(direct == 2){ //오른쪽으로 가던 중
    				
    				if(going != 99 && ladder[i][going+1] == 1) going +=1;
    				else {
    					i--;
    					direct = 0;
    				}
    			}
    			
    		}
    		
    		answer[n] = going;
    		
    	}
    	
    	for(n=0; n<10; n++) System.out.println("#"+(n+1)+" "+answer[n]);
    	
    }
}
package practice;

import java.util.Scanner;

public class SWexpert1216 {
 
    public static void main(String[] args) {
     
    	
    	Scanner scan = new Scanner(System.in);
    	
    	int n, i, j, k;
    	int len, palin_len;
    	boolean flag;
    	String str;
    	char[][] board = new char[100][100];
    	int[] answer = new int[10];
    	
    	
    	for(n=0; n<10; n++) {
    		
    		palin_len = 1;
    		len = 2;
    		flag = true;
    		
    		scan.nextInt();
    		scan.nextLine();

    		
    		//보드판 입력받기
    		for(i=0; i<100; i++) {
    			str = scan.nextLine();
    			
    			for(j=0; j<100; j++)
    				board[i][j] = str.charAt(j);
    		}
    		
    		while(len <= 100) {
    		
	    		//가로 회문 탐색
	    		for(i=0; i<100; i++) {
	    			
	    			for(j=0; j<=100-len; j++) {
	    				flag = true;
	    				
	    				for(k=0; k<len/2; k++) {
	    					if(board[i][j+k] != board[i][j+len-1-k]) {
	    						flag = false;
	    						break;
    						}
    					}
    				
    					if(flag)
    						if(palin_len < len)
    							palin_len = len;
    				
    				}
    			}
    					
    			//세로 회문 탐색
    			for(i=0; i<100; i++) {
    			
    				for(j=0; j<=100-len; j++) {
    					flag = true;
    				
    					for(k=0; k<len/2; k++) {
    						if(board[j+k][i] != board[j+len-1-k][i]) {
    							flag = false;
    							break;
    						}
    					}
    				
    					if(flag)
    						if(palin_len < len)
    							palin_len = len;
    				
    				}
    			}
    			
    			len++;
    			
    		}
    					
    		
    		//정답 저장
    		answer[n] = palin_len;
    	}

    	
    	//정답 출력
    	for(n=0; n<10; n++) System.out.println("#"+(n+1)+" "+answer[n]);
    }
}
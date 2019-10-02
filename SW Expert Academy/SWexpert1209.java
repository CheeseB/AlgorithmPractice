package practice;

import java.util.Scanner;

public class SWexpert1209 {
 
    public static void main(String[] args) {
     
    	Scanner scan = new Scanner(System.in);
    	
    	int n, i, j;
    	int max, temp;
    	int[][] board = new int[100][100];
    	int[] answer = new int[10];
    	
    	for(n=0; n<10; n++) {
    		
    		max = 0;
    		
    		scan.nextInt();
    		
    		for(i=0; i<100; i++)
    			for(j=0; j<100; j++)
    				board[i][j] = scan.nextInt();
    		
    		for(i=0; i<100; i++) {
    			temp = 0;
    			
    			for(j=0; j<100; j++) {
    				temp += board[i][j];
    				if(temp > max) max = temp;
    			}
    		}
    		
    		for(i=0; i<100; i++) {
    			temp = 0;
    			
    			for(j=0; j<100; j++) {
    				temp += board[j][i];
    				if(temp > max) max = temp;
    			}
    		}
    		
    		for(i=0; i<100; i++) {
    			temp = 0;
    			
    			temp += board[i][i];
				if(temp > max) max = temp;
    		}
    		
    		for(i=0; i<100; i++) {
    			temp = 0;
    			
    			temp += board[i][99-i];
				if(temp > max) max = temp;
    		}
    		
    		answer[n] = max;
    		
    	}
    	
    	for(n=0; n<10; n++) System.out.println("#"+(n+1)+" "+answer[n]);
    }
}
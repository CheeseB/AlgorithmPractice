package practice;

import java.util.Scanner;

public class SWexpert1215 {
 
    public static void main(String[] args) {
     
    	
    	Scanner scan = new Scanner(System.in);
    	
    	int n, i, j, k;
    	int len, palin;
    	boolean flag;
    	String str;
    	char[][] board = new char[8][8];
    	int[] answer = new int[10];
    	
    	
    	for(n=0; n<10; n++) {
    		
    		palin = 0;
    		flag = true;
    		
    		len = scan.nextInt();
    		scan.nextLine();

    		
    		//������ �Է¹ޱ�
    		for(i=0; i<8; i++) {
    			str = scan.nextLine();
    			
    			for(j=0; j<8; j++)
    				board[i][j] = str.charAt(j);
    		}
    		
    		//���� ȸ�� Ž��
    		for(i=0; i<8; i++) {
    			
    			for(j=0; j<=8-len; j++) {
    				flag = true;
    				
    				for(k=0; k<len/2; k++) {
    					if(board[i][j+k] != board[i][j+len-1-k]) {
    						flag = false;
    						break;
    					}
    				}
    				
    				if(flag)
    					palin++;
    				
    			}
    		}
    					
    		//���� ȸ�� Ž��
    		for(i=0; i<8; i++) {
    			
    			for(j=0; j<=8-len; j++) {
    				flag = true;
    				
    				for(k=0; k<len/2; k++) {
    					if(board[j+k][i] != board[j+len-1-k][i]) {
    						flag = false;
    						break;
    					}
    				}
    				
    				if(flag)
    					palin++;
    				
    			}
    		}
    					
    		
    		//���� ����
    		answer[n] = palin;
    	}

    	
    	//���� ���
    	for(n=0; n<10; n++) System.out.println("#"+(n+1)+" "+answer[n]);
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class SWexpert1218 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		byte n, valid;
		int len, i;
		boolean flag;
		String input;
		int status[] = new int[4];
    	byte[] answer = new byte[10];
    	
    	for(n=0; n<10; n++) {
    		
    		valid = 1;
    		flag = true;
    		Arrays.fill(status, 0);
    		
    		//입력
    		len = scan.nextInt();
    		scan.nextLine();
    		
    		char paren[] = new char[len];
    		
    		input = scan.nextLine();
    		
    		for(i=0; i<len; i++)
    			paren[i] = input.charAt(i);
    		
    		
    		//구현
    		for(i=0; i<len; i++) {
    			
    			switch(paren[i]) {
    			case '(':
    				status[0]++;
    				break;
    				
    			case '[':
    				status[1]++;
    				break;
    				
    			case '{':
    				status[2]++;
    				break;
    				
    			case '<':
    				status[3]++;
    				break;
    				
    			case ')':
    				if(status[0] == 0) {
    					flag = false;
    					break;
    				}
    				status[0]--;
    				break;
    				
    			case ']':
    				if(status[1] == 0) {
    					flag = false;
    					break;
    				}
    				status[1]--;
    				break;
    				
    			case '}':
    				if(status[2] == 0) {
    					flag = false;
    					break;
    				}
    				status[2]--;
    				break;
    				
    			case '>':
    				if(status[3] == 0) {
    					flag = false;
    					break;
    				}
    				status[3]--;
    				break;
    			}
    			
    			if(!flag) {
    				valid = 0;
    				break;
    			}
    			
    		}
    		
    		if(flag)
    			for(i=0; i<4; i++)
    				if(status[i] != 0) {
    					valid = 0;
    					break;
    				}
    		
    		
    		//정답 저장
    		answer[n] = valid;
    	}

    	
    	//출력
    	for(n=0; n<10; n++) System.out.println("#"+(n+1)+" "+answer[n]);
    	
	}

}

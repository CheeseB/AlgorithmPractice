package practice;

import java.util.Scanner;

public class SWexpert1213 {
 
    public static void main(String[] args) {
     
    	Scanner scan = new Scanner(System.in);
    	
    	int n, i;
    	int sch_len, str_len, count;
    	String sch, str, sub;
    	int[] answer = new int[10];
    	
    	for(n=0; n<10; n++) {
    		
    		count = 0;
    		
    		scan.nextInt();
    		scan.nextLine();
    		
    		sch = scan.nextLine();
    		str = scan.nextLine();
    		
    		sch_len = sch.length();
    		str_len = str.length();
    		
    		for(i=0; i<=str_len-sch_len; i++) {
    			
    			sub = str.substring(i, i+sch_len);
    			
    			if(sch.compareTo(sub)==0)
    				count++;

    		}
    		
    		answer[n] = count;
    	}
    	
    	for(n=0; n<10; n++) System.out.println("#"+(n+1)+" "+answer[n]);
    }
}
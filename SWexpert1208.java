package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
 
    public static void main(String[] args) {
     
    	Scanner scan = new Scanner(System.in);
    	
    	int[] box = new int[101];
    	int[] box_height = new int[101];
    	int[] answer = new int[10];
    	int dump, min_flag, max_flag, sub;
    	int n, i;
    	
    	for(n=0; n<10; n++) {
    		
    		Arrays.fill(box_height, 0);
    		min_flag = 1;
    		max_flag = 100;
    		sub = 0;
    		
    		dump = scan.nextInt();
    		
    		for(i=1; i<=100; i++) box[i] = scan.nextInt();
    		
    		for(i=1; i<=100; i++) box_height[box[i]] += 1;
    		
			for(i=1; i<=100; i++) {
				if(box_height[i] != 0) {
					min_flag = i;
					break;
				}
			}
			
			for(i=100; i<=1; i--) {
				if(box_height[i] != 0) {
					max_flag = i;
					break;
				}
			}
			
			sub = max_flag - min_flag;
    		
    		for(i=0; i<dump; i++) {

    			if(sub <= 1) break;
    			
    			box_height[min_flag]--;
    			box_height[max_flag]--;
    			box_height[min_flag+1]++;
    			box_height[max_flag-1]++;
    			
    			if(box_height[min_flag] == 0) min_flag++;
    			if(box_height[max_flag] == 0) max_flag--;
    			
    			sub = max_flag - min_flag;
    			
    		}
    		
    		answer[n] = sub;
    	
    	}
    	
    	for(n=0; n<10; n++) System.out.println("#"+(n+1)+" "+answer[n]);
    
    }
}
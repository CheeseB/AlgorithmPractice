package practice;

import java.util.Scanner;

public class SWexpert1206 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num, max, jomang;
		int n, i, j;
		int[] count = new int[10];
		
		for(n=1; n<=10; n++) {
			
			count[n-1] = 0;
		
			num = scan.nextInt();
			int[] build = new int[num+4];
		
			for(i=0; i<num; i++) {
				build[i+2] = scan.nextInt();
			}
		
			for(i=2; i<num+2; i++) {
				max = 0;
			
				for(j=-2; j<=2; j++) {
					if(j==0) continue;
					if(max<build[i+j]) max = build[i+j];
				}
			
				jomang = build[i]-max;
				if(jomang <0) jomang = 0;
			
				count[n-1] += jomang;
			
			}
		}
		
		for(i=1; i<=10; i++) System.out.println("#"+i+" "+count[i-1]);
		
	}

}

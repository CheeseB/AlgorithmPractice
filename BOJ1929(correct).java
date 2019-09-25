package practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int m, n;
		
		m = scan.nextInt();
		n = scan.nextInt();
		
		boolean[] notSosu = new boolean[n+1];
		notSosu[0] = true;
		notSosu[1] = true;
		
		for(int i=2; i<=n; i++) {
			if(notSosu[i] == true) continue;
			
			for(int j=2; j<=n; j++) {
				if(i*j > n) break;
				notSosu[i*j] = true;
			}
		}

		for(int k=m; k<=n; k++) {
			if(notSosu[k] == false) System.out.println(k);
		}
		
	}

}

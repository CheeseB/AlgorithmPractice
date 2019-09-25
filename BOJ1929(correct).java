package practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int m, n;
		
		m = scan.nextInt();
		n = scan.nextInt();
		
		boolean[] isSosu = new boolean[n+1];
		isSosu[0] = true;
		isSosu[1] = true;
		
		for(int i=2; i<=n; i++) {
			for(int j=2; j<=n; j++) {
				if(i*j > n) break;
				isSosu[i*j] = true;
			}
		}

		for(int k=m; k<=n; k++) {
			if(isSosu[k] == false) System.out.println(k);
		}
		
	}

}

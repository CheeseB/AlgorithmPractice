package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ1929 {

	public static void main(String[] args) throws IOException {
		
		int m, n, i, j;
		boolean isSosu;
//		Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
//		m = scan.nextInt();
//		n = scan.nextInt();
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		
		if(m == 1) m++;
		
		for(i=m; i<=n; i++) {
			
			isSosu = true;
			for(j=2; j<=i/2; j++) {
				if(i%j == 0) {
					isSosu = false;
					break;
				}
			}
			if(isSosu == true) {
//				System.out.println(isSosu);
				bw.write(i+"\n");
				bw.flush();
			}
		}
		
		bw.close();
	}

}

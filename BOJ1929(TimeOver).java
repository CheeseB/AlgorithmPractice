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
		
		int m, n, yacsu, i, j;
//		Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
//		m = scan.nextInt();
//		n = scan.nextInt();
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		
		for(i=m; i<=n; i++) {
			
			yacsu = 1;
			for(j=1; j<=i/2; j++) {
				if(i%j == 0) {
					yacsu = j;
				}
			}
			if(yacsu == 1 && i != 1) {
//				System.out.println(yacsu);
				bw.write(i+"\n");
				bw.flush();
			}
		}
		
		bw.close();
	}

}

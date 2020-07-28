import java.util.Scanner;

public class SWexpert1220 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n, i, j;
		int count = 0;
		boolean isRed = false;
		int[] answer = new int[10];
		int[][] board = new int[100][100];
		
		for(n=0; n<10; n++) {
			
			//입력
			scan.nextInt();
			for(i=0; i<100; i++)
				for(j=0; j<100; j++)
					board[i][j] = scan.nextInt();
			
			count = 0;
			
			
			//구현
			for(i=0; i<100; i++) {
				for(j=0; j<100; j++) {
					if(board[j][i] == 1) isRed = true;
					else if(board[j][i] == 2 && isRed == true) {
						count++;
						isRed = false;
					}
				}
				isRed = false;
			}
			
			
			//정답
			answer[n] = count;
		}
		
		for(n=0; n<10; n++) System.out.println("#"+(n+1)+" "+answer[n]);
    	
	}

}

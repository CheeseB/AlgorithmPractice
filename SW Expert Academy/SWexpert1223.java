import java.util.Scanner;

public class SWexpert1223 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n, i, j, answer, mul;
		String input;
		String[] input_split1;
		String[] input_split2;
		
		
		for(n=0; n<10; n++) {
			
			answer = 0;
			mul = 1;
			
			//입력
			scan.nextInt();
			scan.nextLine();
			input = scan.nextLine();
			
			
			//구현
			input_split1 = input.split("\\+");
			
			for(i=0; i<input_split1.length; i++)
				if(input_split1[i].length() > 1) {
					input_split2 = input_split1[i].split("\\*");
					
					for(j=0; j<input_split2.length; j++) {
						mul *= Integer.parseInt(input_split2[j]);
					}
						
					answer += mul;
					mul = 1;
					
				}
				else {
					answer += Integer.parseInt(input_split1[i]);
				}
			
			
			//출력
			System.out.println("#"+(n+1)+" "+answer);
		}
	}

}

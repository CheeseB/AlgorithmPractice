import java.util.Scanner;

public class SWexpert1222 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n, i, answer;
		String input;
		String[] input_split;
		
		
		for(n=0; n<10; n++) {
			
			answer = 0;
			
			//�Է�
			scan.nextInt();
			scan.nextLine();
			input = scan.nextLine();
			
			
			//����
			input_split = input.split("\\+");
			
			for(i=0; i<input_split.length; i++)
				answer += Integer.parseInt(input_split[i]);
			
			
			//���
			System.out.println("#"+(n+1)+" "+answer);
		}
	}

}

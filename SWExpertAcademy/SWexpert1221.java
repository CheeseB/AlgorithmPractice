import java.util.Arrays;
import java.util.Scanner;

public class SWexpert1221 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num, n, i, j;
		int[] count = new int[10];
		String input;
		String[] input_arr;
		String[] num_arr = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};
		
		num = scan.nextInt();
		scan.nextLine();
		
		for(n=0; n<num; n++) {
			
			input = "";
			Arrays.fill(count, 0);
			
			//입력
			scan.nextLine();
			input = scan.nextLine();
			
			
			//구현
			input_arr = input.split(" ");
			
			for(i=0; i<input_arr.length; i++)
				for(j=0; j<num_arr.length; j++)
					if(input_arr[i].equals(num_arr[j]))
						count[j]++;
			
			
			//출력
			System.out.println("#"+(n+1));
			
			for(i=0; i<10; i++)
				for(j=0; j<count[i]; j++)
					System.out.print(num_arr[i]+" ");
			
			System.out.println("");
		}
		
	}

}

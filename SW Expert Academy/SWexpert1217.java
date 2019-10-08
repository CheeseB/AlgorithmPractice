package practice;

import java.util.Scanner;

public class SWexpert1217 {
 
    public static void main(String[] args) {
     
    	
    	Scanner scan = new Scanner(System.in);
    	
    	int n, m, ans;
    	int[] answer = new int[10];
    	
    	
    	for(int i=0; i<10; i++) {
    		
    		//�Է�
    		scan.nextInt();
    		n = scan.nextInt();
    		m = scan.nextInt();
    		
    		
    		//����Լ� ȣ��
    		ans = get_ans(n, m);
    		
    		
    		//���� ����
    		answer[i] = ans;
    	}

    	
    	//���� ���
    	for(int j=0; j<10; j++) System.out.println("#"+(j+1)+" "+answer[j]);
    }
    
    public static int get_ans(int n, int m) {
    	int n_ = n;
    	
    	if(m != 1)
    		n_ = n*get_ans(n, m-1);
    	
    	return n_;
    }
}
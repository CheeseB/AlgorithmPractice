package practice;

import java.util.Scanner;
import java.util.Arrays;
 
public class SWexpert1204 {
 
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
         
        int test = scan.nextInt();
         
        int[] score = new int[1000];
        int[] count = new int[101];
        int[] answer = new int[test];
        int test_count, max, flag;
        int n, i, j, k;
         
        for(n=1; n<=test; n++) {
             
            Arrays.fill(count, 0);
            max = 0;
            flag = 0;
             
            test_count = scan.nextInt();
            for(i=0; i<1000; i++) score[i] = scan.nextInt();
             
            for(j=0; j<1000; j++) count[score[j]] += 1;
             
            for(k=0; k<101; k++)
                if(max <= count[k]) {
                    max = count[k];
                    flag = k;
                }
             
            answer[n-1] = flag;
             
        }
         
        for(n=1; n<=test; n++) System.out.println("#"+n+" "+answer[n-1]);
         
    }
}
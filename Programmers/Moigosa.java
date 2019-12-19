import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer;
        int[] num1 = {1,2,3,4,5};
        int[] num2 = {2,1,2,3,2,4,2,5};
        int[] num3 = {3,3,1,1,2,2,4,4,5,5};
        int count1=0, count2=0, count3=0;
        int size, max;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == num1[i%5]) count1++;
            if(answers[i] == num2[i%8]) count2++;
            if(answers[i] == num3[i%10]) count3++;
        }
        
        if(count1 > count2){
            list.add(1);
            max = count1;
        }
        else{
            if(count1 == count2) list.add(1);
            list.add(2);
            max = count2;
        }
        
        if(max <= count3){
            if(max < count3) list.clear();
            list.add(3);
        }
        
        size = list.size();
        answer = new int[size];
        for(int i=0; i<size; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
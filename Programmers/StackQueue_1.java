import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        int i, size, front = 0, count =0;
        int leng = progresses.length;
        ArrayList<Integer> list = new ArrayList<>();
        
        while(front < leng){
            
            for(i=front; i<leng; i++)
                progresses[i] += speeds[i];
            
            for(i=front; i<leng; i++){
                if(progresses[i] >= 100){
                    front++;
                    count++;
                }
                else break;
            }
            if(count > 0){
                list.add(count);
                count = 0;
            }
        }
        
        size = list.size();
        answer = new int[size];
        for(i=0; i<size; i++) answer[i] = list.get(i);
        
        return answer;
    }
}
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int leng = commands.length;
        int[] answer = new int[leng];
        ArrayList<Integer> list = new ArrayList<>();
        int i, j;
        
        for(i=0; i<leng; i++){
            for(j=commands[i][0]-1; j<commands[i][1]; j++)
                list.add(array[j]);
            
            Collections.sort(list);
            answer[i] = list.get(commands[i][2]-1);
            
            list.clear();
        }
        
        return answer;
    }
}
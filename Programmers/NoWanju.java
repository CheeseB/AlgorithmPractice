import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        int i, value;
        
        HashMap<String,Integer> hm = new HashMap<String, Integer>();
        
        //�ؽø� �Է�
        for(String key : participant) hm.put(key, hm.getOrDefault(key, 0)+1);
        
        //������ ����
        for(String key : completion) hm.put(key, hm.get(key)-1);
        
        //�� ã�Ƴ���
        for(Map.Entry<String, Integer> entry : hm.entrySet()){
            value = entry.getValue();
            if(value >= 1){
                answer = entry.getKey();
                break;
            }
        }
        
        return answer;
    }
}
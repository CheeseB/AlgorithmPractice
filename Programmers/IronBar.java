import java.util.Stack;

class Solution {
    public int solution(String arrangement) {
        int answer = 0;
        boolean flag = false;
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<arrangement.length(); i++){
            switch(arrangement.charAt(i)){
                case '(':
                    stack.push(1);
                    flag = true;
                    break;
                    
                case ')':
                    stack.pop();
                    if(flag){
                        if(!stack.empty()){
                            answer += stack.size();
                        }
                    }
                    else
                        answer++;
                    
                    flag = false;
                    break;
            } 
        }
        
        return answer;
    }
}
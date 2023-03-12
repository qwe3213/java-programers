import java.util.*;
public class 올바른괄호 {

    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            //여는 괄호일 때
            if(c == '('){
                stack.push(c);
            }

            //닫는 괄호일 때
            if(c == ')'){
                if(stack.size() == 0){
                    return false;
                }
                else stack.pop();
            }
        }
        if(stack.size() != 0) answer = false;

        return answer;
    }
}

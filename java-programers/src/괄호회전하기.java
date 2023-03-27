import java.util.*;
public class 괄호회전하기 {
    public int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            Stack<Character> stack = new Stack<>();
            String str = s.substring(i, s.length()) + s.substring(0, i);
            // 0번째칸 맨뒤로 보내기
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (stack.isEmpty()) {
                    stack.push(c);
                    //stack 빈칸일경우 c넣기
                } else if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                    // c의 값과 최근에 stack에 들어온 값이 반대방향일경우 최근에 들어온 값 제거
                } else if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else {
                    stack.push(c);
                    // 다 아닐경우 stack에 c 넣기
                }
            }
            if (stack.isEmpty()) {
                answer++;
                //빈칸일 경우 ++
            }
        }

        return answer;
    }
}

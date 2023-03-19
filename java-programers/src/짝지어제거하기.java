import java.util.Stack;
public class 짝지어제거하기 {
    public int solution(String s) {
        int answer = -1;
        Stack<Character> stack = new Stack<>(); // char형 stack 선언
        char[] carr = s.toCharArray(); //문자열 char 배열 쪼깨서 만들기
        for(int i = 0 ; i <carr.length; i++){
            if(!stack.isEmpty() && stack.peek() == carr[i]){
                stack.pop();
                // stack의 값이 빈칸이 아니고 최근에 들어온값이 carr[i]의 값가 같을때 제거
            }else{
                stack.push(carr[i]);
                // 다를경우 stack에 char값 넣기
            }
        }
        if(stack.size() == 0 ){
            answer=1;
            // 만약 stack의 길이가 0일경우 문자열의값이 다 지워진것이기 때문에 answer = 1
        }else{
            answer = 0;
            // 아닐경우 0
        }
        return answer;
    }
}

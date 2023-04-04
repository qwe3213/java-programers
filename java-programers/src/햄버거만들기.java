import java.util.Stack;

public class 햄버거만들기 {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ingredient.length; i++) {
            stack.push(ingredient[i]); // 스택에 값넣기
            if (stack.size() >= 4) {
                if (stack.get(stack.size() - 1) == 1 && stack.get(stack.size() - 2) == 3
                        && stack.get(stack.size() - 3) == 2 && stack.get(stack.size() - 4) == 1)
                // 만약 스택의 길이가 4개일때 들어온순서대로 값 확인
                {
                    answer++;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
                // 햄버거를 만들수 있는 값일경우 4개 제거후 answer++
            }
        }

        return answer;
    }
}

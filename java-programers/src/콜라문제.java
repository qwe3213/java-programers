public class 콜라문제 {
    public int solution(int a, int b, int n) {

        int answer = 0;
        while (n >= a) {
            int btt = n / a;
            n = n - btt * a + btt * b;
            answer = answer + (btt * b);
        }
        return answer;
    }
}

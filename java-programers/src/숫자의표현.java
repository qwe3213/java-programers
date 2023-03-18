public class 숫자의표현 {
    public int solution(int n) {
        int answer = 1; // 자기 자신의숫자도 답이기 때문에 1로 설정
        for (int i = 1; i < n; i++) {
            int num = i; //1부터 1씩증가하기위한 값설정
            for (int j = i + 1; j <= n; j++) {
                num += j; // 1씩증가시킨값더하기
                if (num == n) {
                    answer++;
                    break;
                    //같으면 1더하고 멈추기
                } else if (num > n) {
                    break;
                    // 만약 넘으면 더이상 더하지않고 멈추기
                }
            }
        }
        return answer;
    }
}

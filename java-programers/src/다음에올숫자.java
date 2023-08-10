public class 다음에올숫자 {
    public int solution(int[] common) {
        int answer = 0;

        if((common[1] - common[0]) == (common[2] - common[1])) {
            answer = common[common.length - 1] + (common[1] - common[0]);
            // 등차수열일 경우
        }else {
            answer = common[common.length - 1] * (common[1] / common[0]);
            // 등비수열일 경우
        }
        return answer;
    }
}

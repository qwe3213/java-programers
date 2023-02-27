import java.util.Arrays;
public class 과일장수 {
    class Solution {
        public int solution(int k, int m, int[] score) {
            int answer = 0;
            Arrays.sort(score); // 오름차순 정렬
            int cnt = 0; // 사과개수세기
            for (int i = score.length - 1; i >= 0; i--) {
                cnt++;
                if (cnt % m == 0) {
                    // 배열내의 가장큰수부터 사과상자에 사과가 들어갈 수 있을만큼 들어갔을때 계산하기
                    answer += score[i] * m; // 최대이익 더하기
                }
            }
            return answer;
        }
    }
}

import java.util.Arrays;
public class 크기가작부분문자열 {
    public int solution(String t, String p) {
        int answer = 0;
        int ln = t.length() - p.length(); // 범위설정
        String[] arr = t.split(""); // 문자열 분해후 배열선언
        long pn = Long.parseLong(p); // long타입으로 변환
        for (int i = 0; i <= ln; i++) {
            String an = "";
            for (int j = i; j < p.length() + i; j++) {
                an += arr[j];
                // p문자열의 길이에맞춰 비교할 문자 생성
            }
            long tn = Long.parseLong(an); // long타입 정수형 변환
            if (tn <= pn) { // 비교후 작을시 카운트
                answer++;
            }
        }
        return answer;
    }
}

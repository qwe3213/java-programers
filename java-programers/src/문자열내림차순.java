import java.util.Arrays;
import java.util.Collections;
public class 문자열내림차순 {
    class Solution {
        public String solution(String s) {
            String answer = "";

            String[] str = s.split("");
            Arrays.sort(str, Collections.reverseOrder());

            for(String a : str)
                answer += a;

            return answer;
        }
}

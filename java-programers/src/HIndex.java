import java.util.*;
public class HIndex {
    public int solution(int[] citations) {
        int answer = 0;
        int len = citations.length;
        Arrays.sort(citations);
        boolean check = false;

        for(int i = len - 1; i >= 0; i--){
            if (answer >= citations[i]) {
                break;
            }
            answer++;
        }

        return answer;
    }
}

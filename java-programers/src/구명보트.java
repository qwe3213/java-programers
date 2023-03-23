import java.util.Arrays;
import java.util.ArrayList;
public class 구명보트 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people); // 오름차순 정렬
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < people.length; i++) {
            list.add(people[i]);
        } // 배열을 list로 변환
        while (list.size() > 0) { // list의 길이가 0일경우 멈추게하기
            int le = list.get(0); // list의 제일 작은ㄱ밧
            int si = list.size() - 1; // list 의 마지막 index
            int ri = list.get(si); // list의 제일 큰값
            if (list.size() == 1) { // 만약 list가 1개남았을때 1명남았으므로 +1하고 멈추기
                answer++;
                break;
            } else {
                if (le + ri <= limit) { // 만약 2명이 탈수 있을경우
                    list.remove(0); // 제일작은값 제거
                    int si2 = list.size() - 1; // 작은값이 제거 되었으므로 다시 길이구하기
                    list.remove(si2); // 제일 큰값제거
                    answer++;
                } else {
                    int si3 = list.size() - 1;
                    list.remove(si3); // 2명이 탈수없을땐 제일 큰값 빼기
                    answer++;
                }
            }
        }

        return answer;
    }
}

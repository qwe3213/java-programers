import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class 실패율 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        Map<Integer, Double> map = new HashMap<>();
        int stln = stages.length;
        for (int i = 1; i <= N; i++) {
            int count = 0;
            double lose = 0.0; //스테이지에 도달한 유저가 없는 경우 해당 스테이지의 실패율은 0으로 정의하기.

            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == i) {
                    count++;  //실패한사람 카운트 세기
                }
            }
            if (count != 0 && stln != 0) { //스테이지에 도달한 유저가 없는 경우 해당 스테이지의 실패율은0으로 정의하기위해 조건걸기
                lose = (double) count / (double) stln;  //실패율 구하기
            }
            stln -= count;  //다음 스테이지에 있는 사람수 구하기.
            map.put(i, lose);
        }
        for (int i = 0; i < N; i++) {
            double max = -1;
            int maxKey = 0;
            for (Integer key : map.keySet()) {
                if (max < map.get(key)) {
                    max = map.get(key);
                    maxKey = key;
                }

            }
            answer[i] = maxKey;
            map.remove(maxKey);
        }
        // 실패율이 높은순서대로 answer배열에 넣기

        return answer;
    }
}
}


import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
public class 귤고르기 {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int tan : tangerine) {
            map.put(tan, map.getOrDefault(tan, 0) + 1);
        }
        // 크기의 종류별 개수 세기

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        // 크기의 종류별 개수 List 안에 넣기
        System.out.println(entryList);
        entryList.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        // 개수가 많은 종류별로 오름차순


        for (Map.Entry<Integer, Integer> entry : entryList) {
            if (k <= 0)
                break;
            answer++;
            k -= entry.getValue();
            // 개수가 많은 순부터 사용
        }
        return answer;
    }
}

import java.util.*;
public class 위장 {
    public int solution(String[][] clothes) {
        int answer = 1;
        //ap<String, Integer> map = new HashMap<>();
        // for(int i = 0; i < clothes.length; i++) {
        // 	if(map.get(clothes[i][1]) == null) {
        // 		map.put(clothes[i][1], 1);
        // 	}
        // 	else {
        // 		map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
        // 	}
        // } Map을 사용할경우 null값 한 고려해주어야 함
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i =0; i<clothes.length; i++){
            hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1],0)+1);
        } //HashMap을 사용하면 null값을 고려할 필요가 없음!

        for(String s : hm.keySet()) {
            //옷의 개수 + 옷을 고르지 않는 경우
            answer *= (hm.get(s) + 1);
        }
        answer--;

        return answer;
    }
}

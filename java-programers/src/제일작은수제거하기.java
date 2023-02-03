import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class 제일작은수제거하기 {
    public int[] solution(int[] arr) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i <arr.length; i++){
            list.add(arr[i]);
        }
        // 배열 list 로바꾸기
        int min = Collections.min(list);
        // list에서 최소값 찾기
        list.remove(Integer.valueOf(min));
        // list에서 최소값 제거
        if(list.size()==0){
            list.add(-1);
        }
        // 만약 list 의 사이즈가 0일경우 -1넣기
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
            // list를 배열로 바꾸기
        }

        return answer;
    }
}

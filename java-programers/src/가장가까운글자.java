import java.util.Arrays;
import java.util.ArrayList;
public class 가장가까운글자 {
    public int[] solution(String s) {
        ArrayList<Integer> num = new ArrayList<Integer>(); // list를 선언
        num.add(-1); // 첫번째 값은 무조건 -1
        String[] arr = s.split(""); // 문자쪼개기.
        for (int i = 1; i < arr.length; i++) {
            int count = 0;
            int counts = 0;
            int ans = 0;
            for (int j = 0; j < i; j++) {
                if (!arr[i].equals(arr[j])) {
                    count++; // 다를시 count ++
                } else if (arr[i].equals(arr[j])) {
                    ans = i - j;
                    // 같을시 거리재기 같아서 배열에 바로 넣으면 그후에 같을때도 한번더넣기때문에 맨마지막까지 확인하기위해 끝까지 계산
                }
            }
            if (ans != 0) {
                num.add(ans);
            }
            // 0이아니면 같았을때의 값을 list에 더함
            if (i == count) {
                num.add(-1);
            } // 같을경우 한번도 같지 않았으므로 -1을 list에 더함
        }
        int[] answer = new int[num.size()];
        for (int i = 0; i < num.size(); i++) {
            answer[i] = num.get(i);
        } // list를 배열로 변환
        return answer;
    }
}

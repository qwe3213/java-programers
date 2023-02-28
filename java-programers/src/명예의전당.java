import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
public class 명예의전당 {
    public int[] solution(int k, int[] score) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> rslist = new ArrayList<Integer>();
        ArrayList<Integer> anlist = new ArrayList<Integer>();
        for (int i = 0; i < score.length; i++) {
            list.add(score[i]); // list 변환
        }
        for (int i = 0; i < score.length; i++) {
            rslist.add(score[i]); // 스코어 더하기
            rslist.sort(Comparator.naturalOrder()); // 오름차순 정렬
            if (rslist.size() > k) {
                rslist.remove(0);
                // 만약 리스트의 길이가 k번째보다 크면 제일 낮은점수 제거
            }
            anlist.add(rslist.get(0));
            // 출력값에 제일낮은값 더하기
        }
        int[] answer = new int[anlist.size()];
        for (int i = 0; i < anlist.size(); i++) {
            answer[i] = anlist.get(i);
        }
        // 결과값 list를 배열로 변환
        return answer;
    }
}

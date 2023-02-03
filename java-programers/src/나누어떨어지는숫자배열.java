import java.util.ArrayList;
import java.util.Collections;
public class 나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> num = new ArrayList<Integer>();
        // 정수형 list 선언
        for( int i = 0; i < arr.length; i++){
            if(arr[i]%divisor==0){
                num.add(arr[i]);
                //나눠서 0이될경우 빈 list 더하기
            }
        }
        Collections.sort(num);
        //내림차순 정렬
        if(num.size()==0){
            num.add(-1);
            //만약 list의 사이즈가0일경우 -1 넣어주기
        }
        answer = new int[num.size()];
        for(int i=0; i<num.size(); i++) {
            answer[i] = num.get(i);
            // list를 배열로 바꾸기
        }
        return answer;
    }
}

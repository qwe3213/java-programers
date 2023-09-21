import java.util.*;
public class 테이블함수 {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;

        Arrays.sort(data, (a,b)-> {
            if (a[col-1] == b[col-1]) {
                return Integer.compare(b[0], a[0]);
            } else {
                return Integer.compare(a[col-1], b[col-1]);
            }
        });

        for (int i = row_begin-1; i < row_end; i++) {
            int[] datum = data[i];
            int total = 0;
            for (int i1 : datum) {
                total += (i1 % (i+1));
            }
            answer =  (answer ^ total);
        }



        return answer;
    }
}

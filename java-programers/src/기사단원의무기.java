import java.util.ArrayList;
public class 기사단원의무기 {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        // number은 1보다는 크거나 같기때문에 1은 무조건 있으므로 맨앞에 1추가
        for (int j = 2; j <= number; j++) {
            int count = 0;
            for (int i = 1; i * i <= j; i++) {
                if (i * i == j)
                    count++;
                else if (j % i == 0)
                    count += 2;
            } // 약수의 개수 2부터 number 까지 count하기
            // 제곱근 활용하여 시간 단축
            list.add(count); // list에 count 더하기
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > limit) {
                answer += power;
                // list내의 숫자들중 limit보다 클경우 power로 대체하여 더하기
            } else {
                answer += list.get(i);
                // limit보다 작을경우 list의 숫자 더하기
            }
        }
        return answer;

    }
}

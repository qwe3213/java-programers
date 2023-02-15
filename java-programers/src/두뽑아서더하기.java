import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class 두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        int an;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                an = numbers[i] + numbers[j];
                list.add(an);
                an = 0;
            }
        }
        int[] arr4 = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr4[i] = list.get(i);

        }
        Set<Integer> set = new HashSet<>();
        // set의 자료 구조를 사용하는 것이다.
        // set은 중복된 값을 중복 저장할 수 없기 때문에
        // 중복된 값은 자동으로 처리해 중복되지 않은
        // 데이터만 저장된다. (다른 set 구조를 사용해도 된다.)

        for (int loop : arr4) {
            set.add(loop);
        } // 배열의 있는 값을 하나씩 뽑아주준다.

        Stream<Integer> setS = set.stream();
        setS.forEach(out -> System.out.print(out + " "));
        // 그대로 set 자체로 출력하면 중복이 제거된 데이터만
        // 출력되는 것을 확인할 수 있다.

        System.out.println();
        int[] newArr = new int[set.size()];
        Iterator<Integer> it = set.iterator();
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = it.next();
        }
        System.out.println(Arrays.toString(newArr));
        Arrays.sort(newArr);
        return newArr;
    }

}

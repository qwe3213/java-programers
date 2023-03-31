import java.util.*;
public class 튜플 {
    public int[] solution(String s) {
        int[] answer = {};
        String[] split = s.split("\\},\\{");

        // 배열의 가장 앞 문자열, 배열의 가장 뒷 문자열에서 '{' , '}' 문자 제거
        split[0] = split[0].replaceAll("[{}]","");
        split[split.length-1] = split[split.length-1].replaceAll("[{}]","");
        // ["2", "2,1", "2,1,3", "2,1,3,4"]


        //System.out.println(split[0]);
        //System.out.println(split[split.length-1]);


        // 길이가 짧은 array 순으로 정렬
        String[][] sortedByLength = new String[split.length][];

        for (int i = 0 ; i < split.length ; i++) {
            String[] ss = split[i].split(",");
            sortedByLength[ss.length-1] = ss;
            //System.out.println(Arrays.toString(sortedByLength[ss.length-1]));
        }
        // [["2"],
        // ["2", "1"],
        // ["2", "1", "3"],
        // ["2", "1", "3", "4"]]

        // 길이가 짧은 array를 먼저 보면서,
        // set에 요소를 담으면서, set에 없었던 요소이면 answerStrArr에 추가
        HashSet<String> mySet = new HashSet<>();
        String[] answerStrArr = new String[split.length];
        for (int i = 0 ; i < sortedByLength.length ; i++) {
            for (int j = 0 ; j < sortedByLength[i].length ; j++) {
                if (!mySet.contains(sortedByLength[i][j])) {
                    answerStrArr[i] = sortedByLength[i][j];
                    mySet.add(sortedByLength[i][j]);
                }
            }
        }
        // set: 2, 1, 3, 4
        // answerStrArr: ["2", "1", "3", "4"]

        // 숫자 배열로 변환
        //System.out.println(Arrays.toString(answerStrArr));
        answer = new int[answerStrArr.length];
        for (int i = 0; i < answerStrArr.length ; i++) {
            answer[i] = Integer.parseInt(answerStrArr[i]);
        }

        //System.out.println(Arrays.toString(answer));

        return answer;
    }
}
// 너무 어려워서 풀이를 봤는데 설명을 너무 잘해주셔서 이해가 잘되었다.
// 나도 이렇게 풀 수 있도록 노력해야겠다.
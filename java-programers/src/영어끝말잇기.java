/*import java.util.ArrayList;
class Solution {
    public int[] solution(int n, String[] words) {
        int count = 1;
        int count1 = 0 ;
        int count2 = 0 ;
        int[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        list.add(words[0]);
        for(int i = 1; i <words.length; i++){
            if(words[i].split("")[0].equals(words[i-1].split("")[words[i-1].length()-1])){

                for(int j =  0; j < list.size(); j++){
                    if(words[i].equals(list.get(j))){
                        count--;
                        break;
                    }
                }
                list.add(words[i]);
                count++;
            }else{
                break;
            }
        }
        if(count==words.length) answer = new int[] {0,0};
        else answer = new int[] {count%n+1, count/n+1};

        return answer;
    }
}*/
// 첫번째 오답 문제 count의 미스 인듯함!

import java.util.*;
public class 영어끝말잇기 {
    public int[] solution(int n, String[] words) {
        int[] answer = {};
        int cnt = 1;
        Set<String> set = new HashSet<>();
        set.add(words[0]);

        for(int i=1; i<words.length; i++) {
            if(set.contains(words[i])) break;
            if(words[i].charAt(0)==words[i-1].charAt(words[i-1].length()-1)) {
                set.add(words[i]);
                cnt++;
            }
            else break;
        }

        if(cnt==words.length) answer = new int[] {0,0};
        else answer = new int[] {cnt%n+1, cnt/n+1};

        return answer;
    }
}
// 결국 다른분들의 문제풀이를 보고 배워온 코드..
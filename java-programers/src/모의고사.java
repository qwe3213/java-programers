
import java.util.ArrayList;
import java.util.Collections;

public class 모의고사 {
    public int[] solution(int[] answers) {
        int[] answer = {};
        ArrayList<Integer> num = new ArrayList<Integer>();
        ArrayList<Integer> nums = new ArrayList<Integer>();

        int[] an1 ={1,2,3,4,5};
        int[] an2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] an3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int count1 =0;
        int count2 =0;
        int count3 =0;
        for(int i = 0 ; i<answers.length; i++){
            if(answers[i]==an1[i%5]){
                count1++;
            }
            if(answers[i]==an2[i%8]){
                count2++;
            }
            if(answers[i]==an3[i%10]){
                count3++;
            }
        }
        System.out.print(count3);
        num.add(count1);
        num.add(count2);
        num.add(count3);
        int max = Collections.max(num);
        System.out.println(max);  // 5
        if(max==count1){
            nums.add(1);
        }
        if(max==count2){
            nums.add(2);
        }
        if(max==count3){
            nums.add(3);
        }
        answer = new int[nums.size()];
        for(int i =0; i<answer.length; i++) {
            answer[i] = nums.get(i);
        }
        return answer;
    }
}

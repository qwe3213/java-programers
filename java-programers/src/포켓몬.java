import java.util.HashSet;

public class 포켓몬 {
    public int solution(int[] nums) {
        int answer = 0;
        int n = nums.length / 2;
        HashSet<Integer> n2 = new HashSet<Integer>(); //Hashset 선언 중복을제거할때 쓰임.
        for (int i = 0; i < nums.length; i++) {
            n2.add(nums[i]);
        }
        if (n2.size() <= n) {
            answer = n2.size();  //길이가 같거나 작을때 답
        } else {
            answer = n; 
        }
        return answer;
    }
}

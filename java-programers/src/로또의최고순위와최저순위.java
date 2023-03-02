public class 로또의최고순위와최저순위 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    count1++; // 로또맞출수있는 최대개수
                    count2++; // 로또맞출수있는 최소개수
                } else if (lottos[i] == 0) {
                    count1++; // 로또맞출수있는 최대개수
                    break;
                }
            }
        }
        if (count1 == 6) {
            count1 = 1;
        } else if (count1 == 5) {
            count1 = 2;
        } else if (count1 == 4) {
            count1 = 3;
        } else if (count1 == 3) {
            count1 = 4;
        } else if (count1 == 2) {
            count1 = 5;
        } else {
            count1 = 6;
        }
        if (count2 == 6) {
            count2 = 1;
        } else if (count2 == 5) {
            count2 = 2;
        } else if (count2 == 4) {
            count2 = 3;
        } else if (count2 == 3) {
            count2 = 4;
        } else if (count2 == 2) {
            count2 = 5;
        } else {
            count2 = 6;
        }
        int[] answer = {count1, count2};
        return answer;
    }
}

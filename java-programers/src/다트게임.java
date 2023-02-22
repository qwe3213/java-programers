public class 다트게임 {
    class Solution {
        public int solution(String dartResult) {
            int answer = 0;
            String num = "";
            int[] score = new int[3]; // 배열의길이 3고정
            int nums = 0;
            int idx = 0;
            for (int i = 0; i < dartResult.length(); i++) {
                char ch = dartResult.charAt(i); // 문자열 하나씩더하기
                if (ch >= '0' && ch <= '9') {
                    num += String.valueOf(ch);// 0~10 까지의 문자형 숫자를 찾기
                } else if (ch == 'D' || ch == 'S' || ch == 'T') {
                    nums = Integer.parseInt(num); //숫자이후 문자를 발견했을때 그전의 숫자 정수형으로 변환
                    if (ch == 'S') {
                        nums = (int) Math.pow(nums, 1);   //숫자의 1제곱
                    } else if (ch == 'D') {
                        nums = (int) Math.pow(nums, 2);  //숫자의 2제곱
                    } else if (ch == 'T') {
                        nums = (int) Math.pow(nums, 3);  //숫자의 3제곱
                    }
                    score[idx] = nums;  //0번째에 구한 첫번째 숫자 넣기
                    idx++; // 그다음번째의 숫자 찾기
                    num = ""; // 숫자를 구했므로 다시 빈문자열로 저장
                }
                if (ch == '*') {
                    score[idx - 1] *= 2;
                    if (idx - 2 >= 0) {
                        score[idx - 2] *= 2;
                    }  //만약  두번째나 3번쨰의 숫자를 구했을때 *가 나온경우이면 그전의 숫자도 *2
                } else if (ch == '#') {
                    score[idx - 1] *= -1;
                } // 구한숫자를 마이너스로 바꿔주기
            }
            for (int i = 0; i < score.length; i++) {
                answer += score[i];
            } //이때까지 구한 숫자들의 합 구하기
            return answer;
        }
    }
}



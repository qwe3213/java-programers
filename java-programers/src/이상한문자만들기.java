public class 이상한문자만들기 {
    class Solution {
        public String solution(String s) {
            String answer = "";
            String [] arr =s.split(""); // 문자를 하나씩 쪼개서 배열에 넣기
            int idx = 0 ;
            for(int i = 0 ; i<arr.length; i++){
                if(arr[i].equals(" ")){
                    idx = 0;
                    answer+=" ";
                    // 만약 띄워쓰기 부분일 경우 더해주고 idx를 0으로하여 문자 짝수 홀수 초기화
                } else if(idx%2==0){
                    answer+=arr[i].toUpperCase();
                    idx++;
                    //짝수일경우 대문자
                } else if(idx%2!=0){
                    answer+=arr[i].toLowerCase();
                    idx++;
                    //홀수일경우 소문자
                }
            }
            return answer;
        }
}

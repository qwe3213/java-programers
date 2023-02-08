public class 삼진법뒤집기 {
    public int solution(int n) {
        String st="";
        //0이 아닐동안 매개변수를 3진수로 만들기
        while(n!=0){
            st += n%3;
            n/=3;
        }

        //다시 3진수를 10진수로 변환
        return Integer.parseInt(st,3);
}
}

public class 예상대진표 {
    public int solution(int n, int a, int b) {
    int answer = 0;
    while(true){
        if(a%2 !=0){
            a+=1;
        } // a 가 홀수일시 짝수만들기
        if(b%2 !=0){
            b+=1;
        }// b 가 홀수일시 짝수만들기
        answer++;
        if(a/2 < 1){
            a = 1; // 1일경우 계속 1로만들기
        }else{
            a =a/2; // 아닐경우 2 나누기
        }
        if(b/2 < 1){
            b = 1; // 1일경우 계속 1로만들기
        }else{
            b = b/2; // 아닐경우 2 나누기
        }
        if(a == b){  // 같을때 멈추기
            break;
        }
    }
    return answer;
}
}

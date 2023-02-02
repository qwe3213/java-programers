public class 나머지가1이되는수 {
    public int solution(int n) {
        int answer = 0;
        //System.out.println(n);
        for(int i = 1 ; i < n; i++){
            // int i = 0부터가아닌 1부터 시작해야함 0부터할시 실행 예외 오류가 뜸
            if(n%i==1){
                answer=i;
                break;
            }
        }
        return answer;
    }
}

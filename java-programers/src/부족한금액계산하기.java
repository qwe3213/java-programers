public class 부족한금액계산하기 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        int sum = 0;
        for(int i = 1; i <=count; i++){
            sum +=price;
            answer+=sum;
        }
        if(money>answer){
            answer = 0 ;
        }else{
            answer = answer-money;
        }
        return answer;
    }
}

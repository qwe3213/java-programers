class 정수제곱근판별 {
    public long solution(long n) {
        long x = (long)Math.sqrt(n);

        if(Math.pow(x,2)==n){
            return (long)Math.pow(x+1,2);
        }else {
            return -1;
        }
    }
}


// 2. class 정수제곱근판별 {
//    public long solution(long n) {
//        long answer = 0;
//
//        for (long i = 1; i <= n; i++) {
//            if (i * i == n) {
//                answer = (i + 1) * (i + 1);
//                break;
//            }
//            else answer = -1;
//        }
//        return answer;
//    }
//}
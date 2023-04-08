public class k진수에서소수개수구하기 {
    public int solution(int n, int k) {
        int answer = 0;
        String an = Integer.toString(n, k);
        String[] arr = an.split("0");
        // 조건들을 봤을때 0이나올때마다 나오는 값을 숫자로 변환하면 되기때문에
        // 0이나올때 끊고 배열에 넣기
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("")) {
                long l = Long.parseLong(arr[i]);
                // 빈칸이 아닐경우 정수형 long타입으로 변환
                if (isPrime(l)) {
                    answer++; // 만약 소수일 경우 ++
                }
            }
        }
        return answer;
    }

    // 소수 구하기
    public boolean isPrime(long a) {

        if (a < 2)
            return false;
        // 1은 소수x
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) { // 한번이라도 나누어지면 소수가 아니므로 false
                return false;
            }
        }
        // 한번도 나누어지지 않았을경우 true
        return true;
    }
}

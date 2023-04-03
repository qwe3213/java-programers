public class n개의최소공배수 {
    public int solution(int[] arr) {
        int answer = 0;
        long maxln = 1;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            maxln *= arr[i]; // 배열내의값 전부 곱한값
        }
        for (int i = arr[arr.length - 1]; i <= maxln; i++) {
            // 배열내의 가장큰값부터 최소공배수중 가장큰값까지 하나씩 찾기
            if (count2 == 1) { // 최소공배수를 구했을때 멈추게하기
                break;
            }
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i % arr[j] == 0) {
                    count++; // 배열내의 수를 나누어 0이될때 1씩 더하기
                }
                if (count == arr.length) {
                    answer = i; // 배열내의수가 모두 나누어 지면 i를 answer로 지정
                    count2 = 1; // 멈추기위해 count2를 1로 설정
                }
            }
        }
        return answer;
    }
}

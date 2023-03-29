public class n2배열자르기 {
    public int[] solution(int n, long left, long right) {
        //[1][1] = 1, [1][2] = 2, [1][3] = 3
        //[2][1] = 2, [2][2] = 2, [2][3] = 3
        //[3][1] = 3, [3][2] = 3, [3][3] = 3
        // 원소의 행과 열값중 큰값이 그배열의 값인 것을 알 수 있다.
        int[] answer  = new int[(int)(right-left)+1];
        // 정답의 배열 길이
        for(int i = 0 ; i < answer.length ; i++){
            int row = (int)((i+left)/n+1);
            //행의 값
            int col = (int)((i+left)%n+1);
            //열의 값
            answer[i] = Math.max(row,col); // 둘중 큰값을 배열에 넣기
        }
        return answer;
    }
}

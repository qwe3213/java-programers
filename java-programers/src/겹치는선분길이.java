public class 겹치는선분길이 {
    public int solution(int[][] lines) {
        // 1. arr 배열 및 변수 초기화
        int[] arr = new int[200];
        int answer = 0;

        // 2. lines 정보를 arr 배열에 적용
        for(int i = 0; i < lines.length; i++)
            for(int j = lines[i][0] + 100; j < lines[i][1] + 100; j++)
                arr[j]++;

        // 3. arr 배열에서 겹친 부분 세기
        for(int i = 0; i < 200; i++)
            if(arr[i] > 1)
                answer++;

        return answer;
    }

//        int[] arr = new int[201];
//        int answer = 0;
//        for (int[] line : lines) {
//            int a = line[0] + 100;
//            int b = line[1] + 100;
//            while (a<=b) {
//                if (++arr[a++] == 2) answer++;
//            }
//        }
//        return answer;
//    }
    // 더 간단한 풀이식
}

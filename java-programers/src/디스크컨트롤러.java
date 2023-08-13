import java.util.*;
public class 디스크컨트롤러 {
    public int solution(int[][] jobs) {
        int answer = 0;

        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        //원본 배열 오름차순
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        // 처리 시간 오름차순으로 정렬되는 우선순위 큐(Heap)
        int index = 0;
        int count = 0;
        int total = 0;
        int end = 0;
        while(count < jobs.length) {
            // 요청이 모두 수행될 때까지 반복
            while(index < jobs.length && jobs[index][0] <= end) {
                pq.add(jobs[index++]);
            }
            // 하나의 작업이 완료되는 시점(end)까지 들어온 모든 요청을 큐에 넣음

            if(pq.isEmpty()) {
                end = jobs[index][0];
            } else {
                int[] cur = pq.poll();
                total += cur[1] + end - cur[0];
                end += cur[1];
                count++;
            }

        }
        return total / jobs.length;
    }
}

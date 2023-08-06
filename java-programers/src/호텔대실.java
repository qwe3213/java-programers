import java.util.*;
public class 호텔대실 {
    public int solution(String[][] book_time) {
        int answer = 0;
        int time[][] = new int[book_time.length][2];

        for(int i =0;i<book_time.length;i++){
            int startTime = Integer.parseInt(book_time[i][0].replace(":",""));
            int endTime = Integer.parseInt(book_time[i][1].replace(":",""));

            // 빠른 확인을 위해 int로 변환
            endTime += 10;
            // 10분을 더해서 저장
            if(endTime%100 >= 60){
                endTime+=40;
            }
            // 10분이 더해 60분 초과일 경우 60분차감
            time[i][0] = startTime;
            time[i][1] = endTime;
        }

        Arrays.sort(time, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2){
                return o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0];
            }
        });
        // 시작시간이 빠른순으로 정렬, 시작 시간이 같다면 종료 시간이 빠른순으로 정렬함.

        PriorityQueue<Integer> queue = new PriorityQueue<>();


        for(int[] timeTemp : time){
            if(queue.size() == 0){
                queue.add(timeTemp[1]);
                continue;
            }
            if((queue.peek()) <= timeTemp[0]){
                queue.poll();
                queue.add(timeTemp[1]);
            }else{
                queue.add(timeTemp[1]);
            }
        }
    // 두번째 예약일 경우 빈 방이 있으면 해당 방에 넣고 아니면 새로운 방에 넣음
        return queue.size();
    }
}

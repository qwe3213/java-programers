
import java.util.*;

class 이중우선순위큐 {
    public int[] solution(String[] operations) {
        int[] answer = {0,0};
        PriorityQueue<Integer> minQ = new PriorityQueue();
        PriorityQueue<Integer> maxQ = new PriorityQueue(Collections.reverseOrder());

        int val = 0;

        for(int i = 0; i < operations.length; i++){
            String op = operations[i];
            String opType = op.substring(0,1);
            // 삭제
            if(opType.equals("D")) {
                // 최솟값 삭제
                if(op.charAt(2) == '-') {
                    if(!minQ.isEmpty()) {
                        val = minQ.peek();
                        minQ.poll();
                        maxQ.remove(val);
                    }
                }
                // 최댓값 삭제
                else {
                    if(!maxQ.isEmpty()) {
                        val = maxQ.peek();
                        maxQ.poll();
                        minQ.remove(val);
                    }
                }
            }
            else {  // 추가
                int value = Integer.parseInt(op.substring(2));
                maxQ.offer(value);
                minQ.offer(value);
            }
        }
        // 큐가 비어있지 않으면 [최댓값, 최솟값]
        if(!maxQ.isEmpty()){
            answer[0] = maxQ.peek();
            answer[1] = minQ.peek();
        }

        return answer;
    }
}
import java.util.*;
public class 디펜스게임 {
    public int solution(int n, int k, int[] enemy) {
        int answer = 0;

        if(k>=enemy.length){
            return enemy.length;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0; i<enemy.length; i++){
            pq.add(enemy[i]);
            n -= enemy[i];
            if(n<0){
                if(k==0){
                    return pq.size()-1;
                }else{
                    k--;
                    n += pq.peek();
                    pq.poll();
                    pq.add(0);
                }
            }
        }
        return pq.size();
    }
}

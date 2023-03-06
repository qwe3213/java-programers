public class 옹알이 {

    public int solution(String[] babbling) {
        int answer = 0;
        String arr[] = {"aya", "ye", "woo", "ma"}; // 기본값
        String arrs[] = {"ayaaya", "yeye", "woowoo", "mama"}; // 연속값
        for (int i = 0; i < babbling.length; i++) {
            String an = babbling[i];
            String ans = babbling[i];
            for (int j = 0; j < arr.length; j++) {
                if (!ans.equals(ans.replace(arrs[j], ""))) {
                    break;
                    // 만약 연속값이 있을경우 답이아니므로 다음문자열로 넘어감
                }
                an = an.replace(arr[j], " ");
                // 만약""으로 대체했을때 없어진 문자의 앞과 뒤의 문자가 합쳐져
                // 이상한문자열이 되므로 띄워쓰기로 우선 대체함
            }
            an = an.replace(" ", "");
            // 띄워쓰기로 대체한값 다시 제거하기
            if (an == "") {
                answer++;
            }
            // 모두 제거되었을시 0이므로 answer++
        }
        return answer;
    }
}

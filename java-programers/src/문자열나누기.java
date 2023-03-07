public class 문자열나누기 {
    public int solution(String s) {
        String[] list = s.split("");
        int length = list.length;
        if (length == 0) {
            return 0;
        }

        int answer = 0;
        int index = 0;

        int targetCount = 0;
        int count = 0;
        String target = null;

        while (index < length) {
            if (target == null || targetCount == count) {
                target = list[index];
                answer++;
                targetCount = 1;
                count = 0;
                index++;
                continue;
            }

            if (target.equals(list[index])) {
                targetCount++;
            } else {
                count++;
            }

            index++;
        }

        return answer;

    }
}

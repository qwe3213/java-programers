public class 서울에서김서방찾기 {
    public String solution(String[] seoul) {
        String tmp = "Kim";
        for (int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals(tmp)) {
                tmp = "김서방은 " + i + "에 있다";
                break;
            }
        }
        return tmp;
    }
}

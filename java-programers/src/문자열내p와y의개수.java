public class 문자열내p와y의개수 {
    boolean solution(String s) {
        s = s.toUpperCase();
        boolean answer ;
        int pct = 0;
        int yct = 0;

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'P'){
                pct++;
            }else if(s.charAt(i) == 'Y'){
                yct++;
            }
        }

        if(pct == yct) {
            answer = true;
        }else{
            answer=false;
        }
        return answer;
    }
}

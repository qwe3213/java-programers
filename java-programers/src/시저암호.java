import java.util.Arrays;
public class 시저암호 {
    public String solution(String s, int n) {
        String answer = "";
        String[] arr = s.split(""); // 하나씩 쪼개어서 배열에 넣음
        for(int i = 0 ; i < arr. length; i++){
            if(arr[i].equals(" ")){ // 공백일때 공백추가
                answer+=" ";
            }else{
                char c = arr[i].charAt(0);
                int ch = c+n;
                if(ch>=91 && c <91){ // 소문자에서 범위가 넘었을때 소문자로 변환
                    ch-=26;
                }else if(ch>=123){ //대문자에서 범위가 넘었을때 대문자로 변환
                    ch-=26;
                }
                answer+=(char)(ch);
            }
        }

        return answer;
    }
}

public class 비밀지 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i=0; i<n; i++){
            String decode1 = Integer.toBinaryString(arr1[i]);
            String decode2 = Integer.toBinaryString(arr2[i]);
            String ans = "";
            while(decode1.length() < n){
                decode1 = "0" + decode1;
            }
            while(decode2.length() < n){
                decode2 = "0" + decode2;
            }
            for(int j=0; j<n; j++){
                if(decode1.charAt(j)=='1' || decode2.charAt(j) == '1'){
                    ans += '#';
                }else{
                    ans += " ";
                }
            }
            answer[i] = ans;
        }
        return answer;
    }
}

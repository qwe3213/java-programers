class 문자열내의개수 {
    boolean solution(String s) {
        s = s.toUpperCase();
        int pCount = 0;
        int yCount = 0;

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'P'){
                pCount++;
            }else if(s.charAt(i) == 'Y'){
                yCount++;
            }
        }

        if(pCount == yCount) return true;
        else return false;
    }
}
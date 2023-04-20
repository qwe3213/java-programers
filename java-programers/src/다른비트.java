//class Solution {
//    public long[] solution(long[] numbers) {
//        long[] answer = new long[numbers.length];
//        for(long i = 0; i < numbers.length; i++){
//            long n1 = (Long)numbers[i];
//            String binary = Long.toBinaryString(n1);
//            String arr[] = binary.split("");
//            long num = numbers[i];
//            while(true){
//                int count = 0;
//                num++;
//                String binary2 = Long.toBinaryString(num);
//                String arr2[] = binary2.split("");
//                if(arr.length>=arr2.length){
//                    if(arr.length-arr2.length == 3){
//                        break;
//                    }
//                }
//                if(arr.length<arr2.length){
//                    if(arr2.length-arr.length == 3){
//                        break;
//                    }
//                }
//                if(arr.length>=arr2.length){
//                    for(int i = 0 ; i <arr2.length; i++){
//                        if(arr[i] != arr2[i]){
//                            count++;
//                        }
//                    }
//                }else if(arr.length<arr2.length){
//                    for(int i = 0 ; i <arr.length; i++){
//                        if(arr[i] != arr2[i]){
//                            count++;
//                        }
//                    }
//                }
//                if(count <=2){
//                    answer[i] = num;
//                    break;
//                }
//
//
//            }
//        }
//        return answer;
//    }
//}
// 머리박으면서 풀다 망한코드.
public class 다른비트 {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                answer[i] = numbers[i] + 1;

            } else {
                StringBuilder temp = new StringBuilder();
                String binaryString = Long.toBinaryString(numbers[i]);
                if (!binaryString.contains("0")) {
                    // 맨 앞을 10으로
                    temp.append("10");

                    // 나머지 자리수를 모두 1로
                    temp.append(binaryString.substring(1).replace("0", "1"));

                } else {
                    int lastIndex = binaryString.lastIndexOf("0");
                    int firstOneIndex = binaryString.indexOf("1", lastIndex);
                    // 마지막 0을 1로 수정
                    temp.append(binaryString, 0, lastIndex).append("1");

                    // 마지막 0 다음 1을 0으로 수정
                    temp.append("0");

                    // 그 다음 비트열
                    temp.append(binaryString.substring(firstOneIndex + 1));
                }
                answer[i] = Long.parseLong(temp.toString(), 2);
            }
        }
        return answer;
    }
}

//저번에 비슷한 문제를 풀때도 못풀었는데 이번에또 못풀어서 복습을 제대로 해야겠다는 생각이 들었다.

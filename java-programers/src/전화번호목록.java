import java.util.Arrays;
public class 전화번호목록 {
    class Solution {
        public boolean solution(String[] phone_book) {
            boolean answer = true;
            int count2 = 0;
            Arrays.sort(phone_book);
            for (int i = 0; i < phone_book.length; i++) {
                if (count2 == 1) {
                    answer = false;
                    break;
                }
                char[] arr = phone_book[i].toCharArray();
                for (int j = i + 1; j < phone_book.length; j++) {
                    if (count2 == 1) {
                        answer = false;
                        break;
                    }
                    char[] arr2 = phone_book[j].toCharArray();
                    int count = 0;
                    for (int k = 0; k < arr.length; k++) {
                        if (count2 == 1) {
                            answer = false;
                            break;
                        } else if (arr.length > arr2.length) {
                            break;
                        } else if (arr[k] == arr2[k]) {
                            count++;
                        } else if (arr[k] != arr2[k]) {
                            break;
                        }
                        if (count == arr.length) {
                            count2 = 1;
                            break;
                        }
                    }
                }
            }

            return answer;
        }
    }
}

// 3중 for문을 사용하여 풀어봤는데 효울성문제 4개중 2개를 실패하여 결국 구글에 검색해봤더니 이 문제에 적합한 함수가 있었다.
//
//    public boolean solution(String[] phoneBook) {
//        // 1. phoneBook을 sorting한다.
//        Arrays.sort(phoneBook);
//
//        // 2. 1중 Loop을 돌며 앞 번호가 뒷 번호의 접두어인지 확인한다.
//        for (int i = 0; i < phoneBook.length - 1; i++)
//            if (phoneBook[i + 1].startsWith(phoneBook[i]))
//                return false;
//
//        // 3. 여기까지 오면 접두어가 없다는 것이다.
//        return true;
//    }

// startsWith를 사용하여 쉽게 풀 수 있다.
import java.util.Arrays;

    public class safe_zone {

        public static int solution(int[][] board) {
            int answer = 0;
            int range = 1;

            int[][] c_board = new int[board.length][board[0].length];

            int k = 0;
            for (int[] rows : board) {
                c_board[k] = Arrays.copyOf(rows, board[k].length);
                k++;
            }

            System.out.println(Arrays.deepToString(c_board));

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    int val = board[i][j];

                    if(val == 0) continue;

                    System.out.print("검출된 지뢰 좌표 = [" + i + ", " + j+ "]\n");
                    System.out.println("그 해당 값 = " + val);
                    makeBoomArea(i, j, range,c_board);
                }
            }

            System.out.println("지뢰의 범위 처리 후 board = " + Arrays.deepToString(board));
            System.out.println("지뢰의 범위 처리 후 c_board = " + Arrays.deepToString(c_board));


            for (int[] ints : c_board) {
                for (int anInt : ints) {
                    if(anInt == 0)
                        answer++;
                }
            }

            return answer;
        }

        // 인자로는 복제된 c_board가 전달되었지만 함수 처리시에는 board로 처리한다.
        // 결국 값 변동은 c_board에 있다.
        private static void makeBoomArea(int row, int col, int range, int[][] board) {
            for (int r = row - range; r <= row + range ; r++) {
                if(r < 0 || r >= board.length) {
                    System.out.println("지뢰의 행 범위가 " + r + "이므로 다음으로 넘어갑니다.");
                    continue;
                }
                System.out.print("지뢰의 행 범위 = " + r + " >> ");

                for (int c = col - range; c <= col + range; c++) {
                    if(c < 0 || c >= board[0].length) {
                        System.out.println("지뢰의 열 범위가 " + c + "이므로 다음으로 넘어갑니다.");
                        continue;
                    }
                    System.out.print(c + ", ");



                    board[r][c] = 1;
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {

            // {0, 0, 0, 0, 0} 이므로 5x5행렬
            int[][] board = {{0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0},
                    {0, 0, 1, 0, 0},
                    {0, 0, 0, 0, 0}};

            System.out.println(solution(board));
        }
}

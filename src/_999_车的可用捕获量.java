public class _999_车的可用捕获量 {
    public int numRookCaptures(char[][] board) {
        int res = 0;
        for (int a = 0; a < board.length; a++){
            for (int b = 0; b < board[0].length; b++){
                if(board[a][b] == 'R'){
                    int k;
                    for (int i = -1; i <= 1; i++){
                        if (i == 0)continue;
                        k = i;
                        while(true){
                            if (a + k < 0 || a + k == 8 || board[a + k][b] == 'B')break;
                            if (board[a + k][b] == 'p'){
                                res++;
                                break;
                            }
                            k += i;
                        }
                    }
                    for (int j = -1; j <= 1; j++){
                        if (j == 0)continue;
                        k = j;
                        while (true){
                            if (b + k < 0 || b + k == 8 || board[a][b + k] == 'B')break;
                            if (board[a][b + k] == 'p'){
                                res++;
                                break;
                            }
                            k += j;
                        }
                    }
                }
            }
        }
        return res;
    }
}

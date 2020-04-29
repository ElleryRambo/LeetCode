package 深度优先搜索;

public class _130_被围绕的区域 {
    public void solve(char[][] board) {
        if(board == null || board.length == 0)return ;
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                if (i == 0 || j == 0 || i == board.length - 1 || j == board[0].length - 1 && board[i][j] == 'O'){
                    infect(board, i, j);
                }
            }
        }

        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                if(board[i][j] == 'O')board[i][j] = 'X';
                if(board[i][j] == 'A')board[i][j] = 'O';
            }
        }
    }
    private void infect(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 'X' || grid[i][j] == 'A')return;
        grid[i][j] = 'A';
        infect(grid, i + 1, j);
        infect(grid, i, j + 1);
        infect(grid, i - 1, j);
        infect(grid, i, j - 1);
    }
}

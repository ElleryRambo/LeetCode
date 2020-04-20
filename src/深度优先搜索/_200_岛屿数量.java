package 深度优先搜索;

public class _200_岛屿数量 {
    public int numIslands(char[][] grid) {
        if(grid == null || grid[0] == null)return 0;
        int ans = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == '1'){
                    ans++;
                    infect(grid, i, j);
                }
            }
        }
        return ans;
    }

    private void infect(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1')return;
        grid[i][j] = '2';
        infect(grid, i + 1, j);
        infect(grid, i, j + 1);
        infect(grid, i - 1, j);
        infect(grid, i, j - 1);
    }


}

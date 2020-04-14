package 深度优先搜索;

public class _面试题13_机器人的运动范围 {
    boolean[][] visited;
    int ans = 0;
    public int movingCount(int m, int n, int k) {
        visited = new boolean[m][n];
        dfs(0, 0, m, n, k);
        return ans;
    }

    private void dfs(int row, int col, int m, int n, int k) {
        if (row >= m || col >= n ||(row/10 + row%10 + col/10 + col%10) > k || visited[row][col])return;
        visited[row][col] = true;
        ans++;
        dfs(row + 1, col, m, n, k);
        dfs(row, col + 1, m, n, k);
    }
}

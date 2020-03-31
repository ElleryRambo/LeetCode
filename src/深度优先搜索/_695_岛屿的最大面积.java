package 深度优先搜索;

public class _695_岛屿的最大面积 {
    int vis[][] = new int[50][50];

    public static void main(String[] args) {
        _695_岛屿的最大面积 a = new _695_岛屿的最大面积();
        int test[][] = new int[][]{{0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        int test1[][] = new int [][]{{0,0,0,0,0,0}};
        int test2[][] = new int [][]{{1,1,0,0,0},
                {1,1,0,0,0},
                {0,0,0,1,1},
                {0,0,0,1,1}};
        int aa = a.maxAreaOfIsland(test);
        System.out.println(aa);
    }
    public int maxAreaOfIsland(int[][] grid) {
        int cnt = 0;
        if (grid == null || grid.length == 0 )return 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)
                {
                    cnt = Math.max(cnt,dfs(i,j,grid));
                }
            }
        }
        return cnt;
    }
    private int dfs(int x,int y,int[][] grid) {
        int num = 1;
        vis[x][y]=1;
        for(int i=-1;i<=1;i++){
            if (i == 0)continue;
            if(x + i >= 0&& x + i < grid.length&& grid[x+i][y] == 1&& vis[x+i][y] == 0) {
                num += dfs(x+i,y,grid);
            }
        }
        for (int j = -1; j <= 1; j++){
            if (j == 0)continue;
            if(y + j >= 0&& y + j < grid[0].length&& grid[x][y+j] == 1&&vis[x][y+j] == 0){
                num += dfs(x,y+j,grid);
            }
        }
        return num;
    }
}

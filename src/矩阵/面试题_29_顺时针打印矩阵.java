package 矩阵;

public class 面试题_29_顺时针打印矩阵 {
    int[] mx;
    int j;
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length == 0)return new int[0];
        mx = new int[(matrix.length) * (matrix[0].length)];
        int tR = 0;
        int tC = 0;
        int dR = matrix.length - 1;
        int dC = matrix[0].length - 1;
        j = 0;
        while (tR <= dR && tC <= dC) {
            printEdge(matrix, tR++, tC++, dR--, dC--);
        }
        return mx;
    }
    public void printEdge(int[][] m, int tR, int tC, int dR, int dC) {
        if (tR == dR) {
            for (int i = tC; i <= dC; i++) {
                mx[j++] = m[tR][i];
            }
        } else if (tC == dC) {
            for (int i = tR; i <= dR; i++) {
                mx[j++] = m[i][tC];
            }
        } else {
            int curC = tC;
            int curR = tR;
            while (curC != dC) {
                mx[j++] = m[tR][curC];
                curC++;
            }
            while (curR != dR) {
                mx[j++] = m[curR][dC];
                curR++;
            }
            while (curC != tC) {
                mx[j++] = m[dR][curC];
                curC--;
            }
            while (curR != tR) {
                mx[j++] = m[curR][tC];
                curR--;
            }
        }
    }
}

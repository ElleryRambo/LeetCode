package 矩阵;

import java.util.ArrayList;
import java.util.List;

public class _1380_矩阵中的幸运数 {
    List<Integer> lists = new ArrayList<>();

    public static void main(String[] args) {
        _1380_矩阵中的幸运数 a = new _1380_矩阵中的幸运数();

    }
    public List<Integer> luckyNumbers (int[][] matrix) {
        if (matrix == null || matrix.length == 0)return lists;
        for (int i = 0; i < matrix.length; i++){
            int k = 0, j = 0;
            int min = matrix[i][j];
            for (; j < matrix[0].length; j++){
                if (min > matrix[i][j]){
                    min = matrix[i][j];
                    k = j;
                }
            }
            int l = 0;
            int max = matrix[l][k];
            for (; l < matrix.length; l++){
                max = Math.max(max, matrix[l][k]);
            }
            if(min == max){
                lists.add(max);
            }
        }
        return lists;
    }
}

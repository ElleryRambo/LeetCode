package 矩阵;

public class 面试题_10_09_排序矩阵查找 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0)return false;
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0){
            if (matrix[row][col] > target){
                col--;
            }else if(matrix[row][col] < target){
                row++;
            }else if (matrix[row][col] == target){
                return true;
            }
        }
        return false;
    }
}

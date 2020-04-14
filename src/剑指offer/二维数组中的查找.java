package 剑指offer;

public class 二维数组中的查找 {
    public boolean Find(int target, int [][] array) {
        int row = 0;
        int col = array[0].length - 1;
        while (row < array.length && col >= 0){
            if (array[row][col] > target){
                col--;
            }else if(array[row][col] < target){
                row++;
            }else if (array[row][col] == target){
                return true;
            }
        }
        return false;
    }
}

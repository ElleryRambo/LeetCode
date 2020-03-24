import java.util.Arrays;

public class 面试题_10_01_合并排序的数组 {
    public void merge(int[] A, int m, int[] B, int n) {
        int j = 0,i = 0;
        while(j < B.length && i < A.length){
            if(A[i] == 0){
                A[i] = B[j++];
            }
            i++;
        }
        Arrays.sort(A);
    }
}

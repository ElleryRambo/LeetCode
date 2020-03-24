import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _973_最接近原点的K个点 {
    public static void main(String[] args) {
        int[][] nums = new int[][]{{0,1},{0,1}};
        int[][] test = kClosest(nums,2);
        for (int[] ints : test) {
            for (int i = 0; i < ints.length; i++){
                System.out.println(nums[i]);
            }
        }
    }
    public static int[][] kClosest(int[][] points, int K) {
        if (points == null)return new int[1][];
        int[] distance = new int[points.length];
        int[][] res = new int[K][2];
        for (int i = 0; i < points.length; i++){
            distance[i] = points[i][0] * points[i][0] + points[i][1] * points[i][1];
        }
        Arrays.sort(distance);
        int dk = distance[K - 1];
        int t = 0;
        for (int i = 0; i < points.length; i++){
            if (points[i][0] * points[i][0] + points[i][1] * points[i][1] <= dk){
                res[t++] = points[i];
            }
        }
        return res;
    }
}

package 动态规划;

public class _70_爬楼梯 {
    public static void main(String[] args) {

    }
    public int climbStairs(int n) {
        if (n == 1 || n == 0)
            return 1;
        int prev = 1, curr = 1;
        for (int i = 2; i <= n; i++) {
            int sum = prev + curr;
            prev = curr;
            curr = sum;
        }
        return curr;
    }
}

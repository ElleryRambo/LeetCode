package 深度优先搜索;

public class _494_目标和 {
    int ans = 0;
    public int findTargetSumWays(int[] nums, int S) {
        if(nums == null || nums.length == 0)return 0;
        dfs(nums, S, 0);
        return ans;
    }

    private void dfs(int[] nums, int target, int start) {
        if (start == nums.length){
            if(target == 0){
                ans ++;
            }
            return;
        }
        dfs(nums, target - nums[start], start + 1);
        dfs(nums, target + nums[start], start + 1);
    }
}

package 数组;

public class _560_和为K的子数组 {
    public int subarraySum(int[] nums, int k) {
        int cnt = 0;
        for(int start = 0; start < nums.length; start++){
            int end = start;
            int sum = 0;
            for(; end >= 0; end--){
                sum += nums[end];
                if(sum == k)cnt++;
            }
        }
        return cnt;
    }
}
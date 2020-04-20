package 贪心算法;

public class _55_跳跃游戏 {
    public boolean canJump(int[] nums) {
        int max = nums[0];
        for(int i = 0 ;i < nums.length; i++){
            if(i + nums[i] > max){
                max = i + nums[i];
            }
            if(i > max){
                return false;
            }
        }
        return true;
    }
}

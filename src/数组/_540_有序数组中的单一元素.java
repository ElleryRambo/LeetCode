package 数组;

public class _540_有序数组中的单一元素 {
    public static void main(String[] args) {
        _540_有序数组中的单一元素 a = new _540_有序数组中的单一元素();
        int[] nums = new int[]{1,1,2};
        int aa = a.singleNonDuplicate(nums);
        System.out.println(aa);
    }
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1)return nums[0];
        for (int i = 1; i < nums.length; i++){
            if (nums[i] != nums[i - 1])return nums[i - 1];
            else {
                i++;
                if (i == nums.length - 1){
                    return nums[i];
                }
            }
        }
        return 0;
    }
}

package 排序;

public class 冒泡排序 {
    public static void main(String[] args) {
        冒泡排序 a = new 冒泡排序();
        int[] nums = new int[]{1,3,5,4,2};
        a.bubbleSort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
    public void bubbleSort(int[] nums){
        if (nums == null || nums.length < 2){
            return;
        }
        for (int i = nums.length - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if (nums[j] > nums[j + 1])swap(nums,j,j + 1);
            }
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

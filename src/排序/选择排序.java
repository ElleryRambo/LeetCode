package 排序;

public class 选择排序 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,5,3,4};
        选择排序 a = new 选择排序();
        a.selectSort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
    private void selectSort(int[] nums){
        if (nums == null || nums.length < 2){
            return;
        }
        for (int i = 0; i < nums.length - 1; i++){
            int minIndex = i;
            for (int j = i + 1; j <nums.length; j++){
                minIndex = nums[j] < nums[minIndex] ? j : minIndex;
            }
            swap(nums, i, minIndex);
        }
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

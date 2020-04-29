package 二分查找;

public class _33_搜索旋转排序数组 {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0)return -1;
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while(start <= end){
            mid = start + (end - start) / 2;
            if(nums[mid] == target)return mid;
            if(nums[start] <= nums[mid]){
                if(target >= nums[start] && target < nums[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
            else{
                if(target <= nums[end] && target > nums[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}

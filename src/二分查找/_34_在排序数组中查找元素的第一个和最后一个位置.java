package 二分查找;

public class _34_在排序数组中查找元素的第一个和最后一个位置 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,4};
        int a = right_bound(nums, 2);
        System.out.println(a);
    }
    public int[] searchRange(int[] nums, int target) {
        int left = left_bound(nums, target);
        int right = right_bound(nums, target);
        return new int[]{left, right};
    }

    int left_bound(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (nums[mid] > target){
                right = mid - 1;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else if (nums[mid] == target){
                right = mid - 1;
            }
        }
        if (left >= nums.length || nums[left] != target){
            return -1;
        }
        return left;
    }

    static int right_bound(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (nums[mid] > target){
                right = mid - 1;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else if(nums[mid] == target){
                left = mid + 1;
            }
        }
        if (right < 0 || nums[right] != target){
            return -1;
        }
        return right;
    }
}

import java.util.ArrayList;
import java.util.List;

public class _315_计算右侧小于当前元素的个数 {
    List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        _315_计算右侧小于当前元素的个数 a = new _315_计算右侧小于当前元素的个数();
        int[] nums = new int[]{5,2,6,1};
        List<Integer> lists = new ArrayList<>();
        lists = a.countSmaller(nums);
        for (int num : nums) {
            System.out.println(num);
        }
        for (Integer integer : lists) {
            System.out.println(integer);
        }
    }
    public List<Integer> countSmaller(int[] nums) {
        if (nums == null || nums.length < 2){
            return list;
        }
        return mergeSort(nums, 0, nums.length - 1);
    }

    private List<Integer> mergeSort(int[] nums, int L, int R) {
        if (L == R)return list;
        int mid = L + ((R - L) >> 1);
        mergeSort(nums, L, mid);
        mergeSort(nums, mid + 1, R);
        merge(nums, L, mid, R);
        return list;
    }

    private void merge(int[] nums, int l, int mid, int r) {
        int[] help = new int[r - l + 1];
        int i = 0;
        int p1 = l;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= r){
            if (nums[p1] > nums[p2]){
                list.add(r - p2 + 1);
                help[i++] = nums[p1] > nums[p2] ? nums[p1++] : nums[p2++];
            }
            else {
                list.add(0);
            }
        }
        while (p1 <= mid){
            help[i++] = nums[p1++];
        }
        while (p2 <= r){
            help[i++] = nums[p2++];
        }
    }
}

package 递归;

import java.util.ArrayList;
import java.util.List;

public class _46_全排列 {
    List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        process(nums, 0);
        return lists;
    }

    private void process(int[] nums, int i) {
        if (i == nums.length){
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            lists.add(list);
        }
        for (int j = i; j < nums.length; j++){
            swap(nums, j, i);
            process(nums, i+1);
            swap(nums, j, i);
        }
    }
    private void swap(int[] nums, int index1, int index2){
        int tmp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = tmp;
    }
}

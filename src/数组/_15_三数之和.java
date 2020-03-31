package 数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _15_三数之和 {
    List<List<Integer>> lists = new ArrayList<>();
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> list = new ArrayList<>();
        _15_三数之和 a = new _15_三数之和();
        list = a.threeSum(nums);
        for (List<Integer> integers : list) {
            System.out.println(integers);
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length == 0)
            return lists;
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        three(nums,0,list);

        return lists;
    }

    private void three(int[] nums, int start, List<Integer> list) {
        if (list.size() == 3) {
            int count = 0,flag = 0;
            for (Integer integer : list) {
                count += integer;
            }
            if (count == 0){
                lists.add(new ArrayList<>(list));
            }
            return;
        } else {
            for (int i = start ; i < nums.length; i++) {
                if (start != 0 && list.size() == 0 && nums[start] == nums[start-1]){
                    continue;
                }
                list.add(nums[i]);
                three(nums, i+1, list);
                list.remove(list.size() - 1);
            }
        }
    }
    public static boolean isEquals(List<Integer> list1,List<Integer> list2){
        if(null != list1 && null != list2){
            if(list1.containsAll(list2) && list2.containsAll(list1)){
                return true;
            }
            return false;
        }
        return true;
    }
    public List<List<Integer>> quchong (List<List<Integer>> lists){
        for (int i = 0;i < lists.size();i++){
            if(i == lists.size()-1){
                return lists;
            }
            for (int j = i+1;j<lists.size();j++){
                if (isEquals(lists.get(i),lists.get(j))){
                    lists.remove(i);
                }
            }
        }
        return lists;
    }
}

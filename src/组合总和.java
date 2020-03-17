import java.util.ArrayList;
import java.util.List;

class 组合总和 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,6,7};
        List<List<Integer>> list = new ArrayList<>();
        组合总和 a = new 组合总和();
        list = a.combinationSum(nums,7);
        for (List<Integer> integers : list) {
            System.out.println(integers);
        }
    }

    List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0 || target < 0) {
            return lists;
        }

        List<Integer> list = new ArrayList<>();
        process(0,candidates, target, list);
        return lists;
    }

    private void process(int start,int[] candidates, int target, List<Integer> list) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            lists.add(new ArrayList<>(list));
        } else {
            for (int i = start; i < candidates.length; i++) {
                list.add(candidates[i]);
                //因为每个数字都可以使用无数次，所以递归还可以从当前元素开始
                process( i,candidates, target - candidates[i], list);
                list.remove(list.size() - 1);
            }
        }

    }

}


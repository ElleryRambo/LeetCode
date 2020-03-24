import java.util.ArrayList;
import java.util.List;

public class _78_子集 {
    List<List<Integer>> lists = new ArrayList();
    public static void main(String[] args) {
        List<List<Integer>> l = new ArrayList();
        _78_子集 a = new _78_子集();
        int[] nums = new int[]{1,2,3};
        l = a.subsets(nums);
        for (List<Integer> list : l) {
            System.out.println(list);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        if (nums.length == 0){
            return lists;
        }
        List<Integer> list = new ArrayList<>();
        subs(nums,0,list);
        return lists;
    }

    private void subs(int[] nums, int start, List<Integer> list) {
        lists.add(new ArrayList<>(list));
        for (int i = start;i < nums.length;i++){
            list.add(nums[i]);
            subs(nums,i+1,list);
            list.remove(list.size()-1);
        }
    }
}

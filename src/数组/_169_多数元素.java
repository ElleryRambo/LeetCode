package 数组;

import java.util.HashMap;
import java.util.Map;

public class _169_多数元素 {
    int ans;
    public static void main(String[] args) {
        int[] test = new int[]{3, 2, 3};
        int flag = 0;
        _169_多数元素 a = new _169_多数元素();
        int d = a.majorityElement(test);
        System.out.println(d);
    }
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        int flag = 0;
        for (int i = 0;i < nums.length;i++){
            int before = map.getOrDefault(nums[i],0);
            if(before >= nums.length/2){
                return nums[i];
            }
            map.put(nums[i],before+1);
        }
        return ans;
    }
}

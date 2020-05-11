package 栈;

import java.util.ArrayList;
import java.util.List;

public class _1441_用栈操作构建数组 {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int index = 0;
        for(int i = 1; i <= n; i++){
            if(target[index] == i){
                ans.add("Push");
                index++;
                if(index == target.length)break;
            }else{
                ans.add("Push");
                ans.add("Pop");
            }
        }
        return ans;
    }
}

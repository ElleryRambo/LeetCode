package 深度优先搜索;

import java.util.ArrayList;
import java.util.List;

public class _22_括号生成 {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        int left = 0;
        int right = 0;
        dfs(list, "", n, left, right);
        return list;
    }

    private void dfs(List<String> list, String s, int n, int left, int right) {
        if (right > left || left > n || right > n)return;
        if (left == right && right == n){
            list.add(s);
            return;
        }
        dfs(list, s + "(", n, left + 1, right);
        dfs(list, s + ")", n, left, right + 1);
    }
}

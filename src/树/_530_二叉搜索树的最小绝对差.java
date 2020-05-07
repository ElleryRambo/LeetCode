package 树;

import java.util.Stack;

public class _530_二叉搜索树的最小绝对差 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int getMinimumDifference(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        int ans = Integer.MAX_VALUE;
        int val = -1;

        while(!stack.isEmpty() || root != null){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            //val>=0判断是否是第一次
            if(val >= 0)ans = Math.min(ans, root.val - val);

            val = root.val;
            root = root.right;
        }
        return ans;
    }
}

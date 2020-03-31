package 树;

import java.util.Stack;

public class _98_验证二叉搜索树 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        double val = - Double.MAX_VALUE;

        while (!stack.isEmpty() || root != null){
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (val >= root.val)return false;
            val = root.val;
            root = root.right;
        }
        return true;
    }
}

package 树;

import java.util.LinkedList;
import java.util.Queue;

public class _958_二叉树的完全性检验 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isCompleteTree(TreeNode root) {
        if (root == null)return true;
        Queue<TreeNode> queue = new LinkedList<>();
        boolean leaf = false;
        TreeNode left = null;
        TreeNode right = null;
        queue.offer(root);
        while (!queue.isEmpty()){
            root = queue.poll();
            left = root.left;
            right = root.right;
            if(leaf && (left != null || right != null) || left == null && right != null)return false;
            if (left != null)queue.offer(left);
            if (right != null)queue.offer(right);
            else leaf = true;
        }
        return true;
    }
}

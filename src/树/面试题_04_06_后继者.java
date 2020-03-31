package 树;

public class 面试题_04_06_后继者 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if(root == null)return null;
        if (root.val <= p.val)return inorderSuccessor(root.right, p);
        TreeNode res = inorderSuccessor(root.left, p);
        return res == null ? root : res;
    }
}

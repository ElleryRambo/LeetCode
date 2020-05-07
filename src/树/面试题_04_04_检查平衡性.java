package 树;

public class 面试题_04_04_检查平衡性 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isBalanced(TreeNode root) {
        if(root == null)return true;
        int depthLeft = getDepth(root.left);
        int depthRight = getDepth(root.right);
        if(Math.abs(depthRight - depthLeft) > 1)return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int getDepth(TreeNode root){
        if(root == null)return 0;
        int depthLeft = getDepth(root.left);
        int depthRight = getDepth(root.right);
        return Math.max(depthLeft, depthRight) + 1;
    }
}

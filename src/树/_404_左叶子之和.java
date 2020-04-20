package 树;

public class _404_左叶子之和 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
//    int ans = 0;
//    public int sumOfLeftLeaves(TreeNode root) {
//        sumOfLeft(root);
//        return ans;
//    }
//
//    void sumOfLeft(TreeNode root){
//        if(root == null)return;
//        if(root.left != null && root.left.left == null && root.left.right == null){
//            ans += root.left.val;
//
//        }
//        if(root.left != null)sumOfLeft(root.left);
//        if(root.right != null)sumOfLeft(root.right);
//    }

    int ans = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)return 0;
        int ans = 0;
        if(root.left != null && root.left.left == null && root.left.right ==null)ans += root.left.val;
        ans += sumOfLeftLeaves(root.left);
        ans += sumOfLeftLeaves(root.right);
        return ans;
    }
}

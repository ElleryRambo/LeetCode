package 树;

public class _437_路径总和III {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    int cnt = 0;
    public int pathSum(TreeNode root, int sum) {
        if (root == null)return 0;
        sum(root, sum);
        pathSum(root.left, sum);
        pathSum(root.right, sum);
        return cnt;
    }

    void sum(TreeNode root, int sum){
        if (root == null)return;
        sum -= root.val;
        if (sum == 0){
            cnt++;
        }
        sum(root.left, sum);
        sum(root.right, sum);
    }
}

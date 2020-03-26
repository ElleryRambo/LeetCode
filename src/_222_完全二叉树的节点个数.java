public class _222_完全二叉树的节点个数 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int countNodes(TreeNode root) {
        if (root == null)return 0;
        return bs(root, 1, mostLeftLevel(root, 1));
    }

    private int mostLeftLevel(TreeNode root, int level) {
        while (root != null){
            level++;
            root = root.left;
        }
        return level - 1;
    }

    public int bs(TreeNode node, int level, int h){
        if (level == h) {
            return 1;
        }
        if (mostLeftLevel(node.right, level + 1) == h) {
            return (1 << (h - level)) + bs(node.right, level + 1, h);
        } else {
            return (1 << (h - level - 1)) + bs(node.left, level + 1, h);
        }
    }
}

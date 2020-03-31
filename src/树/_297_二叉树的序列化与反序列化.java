package 树;

import java.util.LinkedList;
import java.util.Queue;

public class _297_二叉树的序列化与反序列化 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null)return "#!";
        String res = root.val + "!";
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            root = queue.poll();
            if (root.left != null){
                res += root.left.val + "!";
                queue.offer(root.left);
            }else res += "#!";
            if (root.right != null){
                res += root.right.val + "!";
                queue.offer(root.right);
            }else res += "#!";
        }
        return res;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] values = data.split("!");
        int index = 0;
        TreeNode head = generateNodeByString(values[index++]);
        Queue<TreeNode> queue = new LinkedList<>();
        if (head != null) {
            queue.offer(head);
        }
        TreeNode node = null;
        while (!queue.isEmpty()) {
            node = queue.poll();
            node.left = generateNodeByString(values[index++]);
            node.right = generateNodeByString(values[index++]);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return head;
    }

    private TreeNode generateNodeByString(String value) {
        if (value.equals("#"))return null;
        return new TreeNode(Integer.valueOf(value));
    }
}

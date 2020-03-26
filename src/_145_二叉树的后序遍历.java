import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _145_二叉树的后序遍历 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        if(root == null)return list;
        stack.push(root);
        while(!stack.isEmpty()){
            root = stack.pop();
            stack2.push(root);
            if (root.left != null) {
                stack.push(root.left);
            }
            if (root.right != null) {
                stack.push(root.right);
            }
        }
        while(!stack2.isEmpty()){
            list.add(stack2.pop().val);
        }
        return list;
    }
}

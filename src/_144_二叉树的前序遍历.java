import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _144_二叉树的前序遍历 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null)return list;
        if(root != null){
            Stack<TreeNode> stack = new Stack<TreeNode>();
            stack.add(root);
            while(!stack.isEmpty()){
                root = stack.pop();
                list.add(root.val);
                if(root.right != null)stack.push(root.right);
                if(root.left != null)stack.push(root.left);
            }
        }
        return list;
    }
}

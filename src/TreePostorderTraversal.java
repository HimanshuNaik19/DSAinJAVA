import java.util.ArrayList;
import java.util.List;

public class TreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        postorder(root,result);
        return result;
    }
    public void postorder(TreeNode root, List<Integer> result){
        if(root == null) return;

        postorder(root.left,result);
        postorder(root.right,result);
        result.add(root.val);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        TreePostorderTraversal solution = new TreePostorderTraversal();
        List<Integer> result = solution.postorderTraversal(root);
        System.out.println("Postorder Traversal: " + result);
    }
}

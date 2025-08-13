
import java.util.ArrayList;
import java.util.List;

public class TreeInorderTraversal {
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root,result);
        return result;
    }
    public void inorder(TreeNode root, List<Integer> result){
        if(root == null) return;

        inorder(root.left,result);
        result.add(root.val);
        inorder(root.right,result);

    }
    public static void main(String a[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        TreeInorderTraversal solution = new TreeInorderTraversal();
        List<Integer> result = solution.inorderTraversal(root);
        System.out.println("Inorder Traversal: " + result);
        // Expected output: Inorder Traversal: [4, 2, 5, 1, 3]
    }
}


import java.util.ArrayList;
import java.util.List;

class TreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        preorder(root,result);
        return result;
    }
    public void preorder(TreeNode root, List<Integer> result){
        if(root == null) return;

        result.add(root.val);
        preorder(root.left,result);
        preorder(root.right,result);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        TreePreorderTraversal solution = new TreePreorderTraversal();
        List<Integer> result = solution.preorderTraversal(root);
        System.out.println("Preorder Traversal: " + result);
    }
}

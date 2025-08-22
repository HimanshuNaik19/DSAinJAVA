public class BalanceTree {
    public boolean isBalanced(TreeNode root){
        return height(root) != -1;
    }
    public int height(TreeNode root){
        if(root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        if(left ==-1 ||right ==-1 || Math.abs(left - right) >1 ) return -1;
        return Math.max(left, right) + 1;
    }
  public static void main(String[] args) {
    BalanceTree s1 = new BalanceTree();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right.left = new TreeNode(4);
    root.right.right = new TreeNode(3);
    System.out.println(s1.isBalanced(root));
  }
}

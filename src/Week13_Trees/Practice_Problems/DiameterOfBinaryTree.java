package Week13_Trees.Practice_Problems;

public class DiameterOfBinaryTree {
    public static class Pair{
        int diameter;
        int height;
        Pair(){}
        Pair(int diameter, int height){
            this.diameter = diameter;
            this.height = height;
        }
    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
      }
  }
  public static TreeNode insertTreeNode(TreeNode root, int val){
        if (root == null) return new TreeNode(val);
        else if (val < root.val) root.left = insertTreeNode(root.left,val);
        else root.right  = insertTreeNode(root.right,val);
        return root;
  }
  public static int diameterOfBinaryTree(TreeNode root) {
      Pair res = diameterOfBinaryTreeHelper(root);
      return res.diameter;
  }
  public static Pair diameterOfBinaryTreeHelper(TreeNode root) {
        if (root ==null) return new Pair(0,0);
        Pair left;
        Pair right;
        Pair result = new Pair();
        //get height and max diameter for the left and right subtree
        left = diameterOfBinaryTreeHelper(root.left);
        right = diameterOfBinaryTreeHelper(root.right);

        //store the height of the current node in result
        result.height = Math.max(left.height, right.height)+1;
        //storing maximum diameter in the subtree of current node
        result.diameter = Math.max(left.diameter, right.diameter);
        //comparing the diameter of current node to max dia of subtrees
        result.diameter = Math.max(result.diameter,(left.height+right.height));
        return result;
    }

    public static void main(String[] args) {
        TreeNode root;
        int[] input = new int[]{1,2};
        root = new TreeNode(input[0]);
        for (int i=1;i< input.length; i++){
          insertTreeNode(root,input[i]);
        }
        System.out.println("Diameter of the given Tree is: ");
        System.out.println(diameterOfBinaryTree(root));
    }
}

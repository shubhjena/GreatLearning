package Week13_Trees.Practice_Problems;
//226. Invert Binary Tree
/*
Given the root of a binary tree, invert the tree, and return its root.
 */

public class InvertBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    //node insertion method
    public static TreeNode insertTreeNode(TreeNode root, int val){
        if (root == null) return new TreeNode(val);
        else if (val < root.val) root.left = insertTreeNode(root.left,val);
        else root.right  = insertTreeNode(root.right,val);
        return root;
  }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = temp;
        return root;
    }
    public static void main(String[] args) {
        TreeNode root;
        int[] input = new int[]{1,2};
        root = new TreeNode(input[0]);
        for (int i=1;i< input.length; i++){
          insertTreeNode(root,input[i]);
        }
        invertTree(root);
    }
}

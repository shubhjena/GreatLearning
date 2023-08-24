package Week13_Trees.Practice_Problems;
//226. Invert Binary Tree
/*
Given the root of a binary tree, invert the tree, and return its root.
 */

public class InvertBinaryTree {

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = temp;
        return root;
    }
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        int[] input = new int[]{1,2};
        bt.root = new TreeNode(input[0]);
        for (int i=1;i< input.length; i++){
          bt.insertTreeNode(bt.root,input[i]);
        }
        invertTree(bt.root);
    }
}

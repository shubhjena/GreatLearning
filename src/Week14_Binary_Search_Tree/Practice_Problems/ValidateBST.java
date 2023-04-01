package Week14_Binary_Search_Tree.Practice_Problems;
//98. Validate Binary Search Tree
/*
Given the root of a binary tree, determine if it is a valid binary search tree (BST).
A valid BST is defined as follows:
-The left subtree of a node contains only nodes with keys less than the node's key.
-The right subtree of a node contains only nodes with keys greater than the node's key.
-Both the left and right subtrees must also be binary search trees.
 */
public class ValidateBST {
    public static boolean isValidBST(TreeNode root) {
        return helpBSTCheck(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public static boolean helpBSTCheck(TreeNode root, long min, long max){
        if(root == null) return true;
        if((root.val<=min) || (root.val>=max)) return false;
        return helpBSTCheck(root.left, min,root.val) &&
                helpBSTCheck(root.right,root.val,max);
    }
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        int[] input = new int[]{2,1,3};
        bt.root = bt.insertLevelOrder(input,0);
        System.out.println("The given tree is a valid BST: "+isValidBST(bt.root));
    }
}

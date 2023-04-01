package Week14_Binary_Search_Tree;
//700. Search in a Binary Search Tree
/*
You are given the root of a binary search tree (BST) and an integer val.

Find the node in the BST that the node's value equals val and return the
subtree rooted with that node. If such a node does not exist, return null.
 */
public class SearchBST {
    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if(root.val == val) return root;
        else if(root.val> val) return searchBST(root.left, val);
        else return searchBST(root.right, val);
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        int val = 5;
        int[] input  = new int[]{1,2,3,0,5};
        bt.root = bt.insertLevelOrder(input,0);
        searchBST(bt.root,val);
    }
}

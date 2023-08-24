package Week14_Binary_Search_Tree;
//701. Insert into a Binary Search Tree
/*
You are given the root node of a binary search tree (BST) and a value to insert into the tree.
Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in the original BST.
Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion.
You can return any of them.
 */
public class InsertIntoBST {
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        else if (val < root.val) root.left = insertIntoBST(root.left, val);
        else root.right = insertIntoBST(root.right, val);
        return root;
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        int[] input  = new int[]{1,2,3,0,5};
        bt.root = bt.insertLevelOrder(input,0);
        insertIntoBST(bt.root,6);
    }
}

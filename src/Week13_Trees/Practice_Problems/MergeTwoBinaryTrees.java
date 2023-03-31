package Week13_Trees.Practice_Problems;
//617. Merge Two Binary Trees
/*
You are given two binary trees root1 and root2.
Imagine that when you put one of them to cover the other,
some nodes of the two trees are overlapped while the others are not.
You need to merge the two trees into a new binary tree. The merge rule
is that if two nodes overlap, then sum node values up as the new value
of the merged node. Otherwise, the NOT null node will be used as the node of the new tree.
Return the merged tree.
Note: The merging process must start from the root nodes of both trees.
 */
public class MergeTwoBinaryTrees {
    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return null;
        if (root1 == null) return root2;
        if (root2 == null) return root1;
        root1.val += root2.val;
        root1.left = mergeTrees(root1.left,root2.left);
        root1.right = mergeTrees(root1.right,root2.right);
        return root1;
    }

    public static void main(String[] args) {
        BinaryTree tree1 = new BinaryTree();
        int[] input = new int[]{1,3,2,5};
        tree1. root = tree1.insertLevelOrder(input,0);

        BinaryTree tree2 = new BinaryTree();
        int[] inputSubtree = new int[]{2,1,3,0,4,0,7};
        tree2.root = tree2.insertLevelOrder(inputSubtree,0);
        mergeTrees(tree1.root,tree2.root);
        tree1.levelOrderTraversal(tree1.root);
    }
}

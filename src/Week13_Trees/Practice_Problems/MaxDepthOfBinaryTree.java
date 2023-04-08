package Week13_Trees.Practice_Problems;
//104. Maximum Depth of Binary Tree
/*
Given the root of a binary tree, return its maximum depth.
A binary tree's maximum depth is the number of nodes along the
longest path from the root node down to the farthest leaf node.
 */
public class MaxDepthOfBinaryTree {
    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;
            //max of left child depth and right child depth + 1 is the depth of node
        else return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1,2,3,4,5};
        BinaryTree bt = new BinaryTree();
        bt.root = bt.insertLevelOrder(input,0);
        System.out.println("Maximum depth of tree is "+maxDepth(bt.root));
    }
}

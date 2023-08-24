package Week13_Trees.Practice_Problems;

import java.util.Arrays;

//108. Convert Sorted Array to Binary Search Tree
/*
Given an integer array nums where the elements are sorted in ascending order, convert it to a
height-balanced
 binary search tree.
 */
public class SortedArrayToHeightBalancedBST {
    public  static TreeNode sortedArrayToBST(int[] nums) {
        int len = nums.length;
        TreeNode root = new TreeNode(nums[len/2]);
        if(len>1)
            root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, len/2));
        if(len/2+1<len)
            root.right = sortedArrayToBST(Arrays.copyOfRange(nums, len/2+1, len));
        return root;
    }

    public static void main(String[] args) {
        int[]  nums = new int[]{1,2,3,4,5,6};
        BinaryTree bt = new BinaryTree();
        bt.root = sortedArrayToBST(nums);
        bt.levelOrderTraversal(bt.root);
    }
}
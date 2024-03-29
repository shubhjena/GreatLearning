package Week14_Binary_Search_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    TreeNode root;

    public TreeNode insertTreeNode(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        else if (val < root.val) root.left = insertTreeNode(root.left, val);
        else root.right = insertTreeNode(root.right, val);
        return root;
    }
    public TreeNode insertLevelOrder(int[] arr, int i){
        TreeNode root = null;
        // Base case for recursion
        if (i < arr.length) {
            root = new TreeNode(arr[i]);

            // insert left child
            root.left = insertLevelOrder(arr, 2 * i + 1);

            // insert right child
            root.right = insertLevelOrder(arr, 2 * i + 2);
        }
        return root;
    }
    public void levelOrderTraversal(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {

            TreeNode tempNode = queue.poll();
            System.out.print(tempNode.val + " ");

            /*Enqueue left child */
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            /*Enqueue right child */
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    //constructors
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
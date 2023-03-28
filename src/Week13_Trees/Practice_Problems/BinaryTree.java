package Week13_Trees.Practice_Problems;

public class BinaryTree {
    TreeNode root;

    public TreeNode insertTreeNode(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        else if (val < root.val) root.left = insertTreeNode(root.left, val);
        else root.right = insertTreeNode(root.right, val);
        return root;
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
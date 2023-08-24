package Week13_Trees.Practice_Problems;
//101. Symmetric Tree
/*
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 */
public class SymmetricTree {
    static boolean flag = true;
    public static boolean isSymmetric(TreeNode root) {
        inOrderTraversal(root.left, root.right);
        return flag;
    }
    private static void inOrderTraversal(TreeNode leftSide, TreeNode rightSide){
        if (leftSide == null && rightSide == null) return;
        if (leftSide == null || rightSide == null){
            flag = false;
            return;
        }
        inOrderTraversal(leftSide.left,rightSide.right);
        if(leftSide.val != rightSide.val) flag = false;
        inOrderTraversal(leftSide.right,rightSide.left);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] input = new int[]{1,2,2,3,4,4,3};
        tree.root = tree.insertLevelOrder(input,0);
        System.out.println("Is the binary tree symmetric?\n"+ isSymmetric(tree.root));
    }
}

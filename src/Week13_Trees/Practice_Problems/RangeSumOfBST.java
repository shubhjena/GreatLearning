package Week13_Trees.Practice_Problems;
//938. Range Sum of BST
/*
Given the root node of a binary search tree and two integers low and high,
return the sum of values of all nodes with a value in the inclusive range [low, high].
 */
public class RangeSumOfBST {
    public static int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return 0;
        int sum = 0;
        if(root.val>=low && root.val<=high) sum+=root.val;
        //as it is BST
        if(root.val>low) sum+=rangeSumBST(root.left,low,high);
        if(root.val<high) sum+=rangeSumBST(root.right,low,high);
        return  sum;
    }
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        int[] input = new int[]{10,5,15,3,7,18};
        bt.root = new TreeNode(input[0]);
        for (int i=1;i< input.length; i++){
            bt.insertTreeNode(bt.root,input[i]);
        }
        System.out.println(rangeSumBST(bt.root,7,15));
    }
}

package Week14_Binary_Search_Tree;

public class MinimumElementBST {
    static int minValue(TreeNode node) {
        if (node == null) return -1;
        while(node.left !=null){
            node = node.left;
        }
        return node.val;
    }
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        int[] input  = new int[]{1,2,3,0,5};
        bt.root = bt.insertLevelOrder(input,0);
        System.out.println("Minimum element: "+ minValue(bt.root));
    }
}

package Week14_Binary_Search_Tree;

public class DeleteNodeInBST {
    public static TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(root.val == key){
            if(root.left == null) return root.right;
            else if (root.right == null) return root.left;
            else{
                int pred = inOrderPredecessor(root);
                root.val = pred;
                root.left= deleteNode(root.left,pred);
            }
        }
        else if(root.val> key) root.left = deleteNode(root.left, key);
        else root.right = deleteNode(root.right, key);
        return root;
    }
    public static int inOrderPredecessor(TreeNode node){
        node = node.left;
        while(node.right != null)
            node = node.right;
        return node.val;
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        int[] input  = new int[]{1,2,3,0,5};
        bt.root = bt.insertLevelOrder(input,0);
        deleteNode(bt.root,3);
    }
}

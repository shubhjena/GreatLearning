package Week13_Trees;

public class SumTree {
    Node root;
    static class Node{
        int data;
        Node left;
        Node right;

        //constructor
        Node(int value) {
            this.data = value;
            left = null;
            right = null;
        }
    }
    public static int getSumTree(Node root){
        int nodeVal = root.data;
        int leftSum = (root.left != null)? getSumTree(root.left): 0;
        int rightSum = (root.right != null)? getSumTree(root.right): 0;
        root.data = leftSum+rightSum;
        return nodeVal + root.data;
    }
    private Node addRecursively(Node current, int value){
        if (current == null) return new Node(value);

        else if (value < current.data)
            current.left = addRecursively(current.left, value);
        else if (value > current.data)
            current.right = addRecursively(current.right,value);

        return current;
    }

    private void add(int value){
        addRecursively(root, value);
    }
    public static void printTree(Node root){
        if (root == null)
            return;
        System.out.print(root.data+" ");
        printTree(root.left);
        printTree(root.right);
    }
    public static void main(String[] args) {
        int[] treeData = new int[]{1,7,2,8,3,9,4,10,5,11,6};
        SumTree tree = new SumTree();
        tree.root = new Node(0);
        for (int i: treeData){
            tree.add(i);
        }
        printTree(tree.root);
        System.out.println();
        getSumTree(tree.root);
        printTree(tree.root);

    }
}

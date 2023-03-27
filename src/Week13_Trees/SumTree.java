package Week13_Trees;

public class SumTree {
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
}

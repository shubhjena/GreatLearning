package Week13_Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeImplementation {

    Node root;

    //methods
    static class Node{
        int data;
        Node left;
        Node right;

        //constructor
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
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

    //traversal methods
    private void levelOrderTraversal(Node root){
        Queue<Node> queue = new LinkedList<>();
        System.out.println(root.data);
        if(root.left !=null) queue.add(root.left);
        if(root.right !=null) queue.add(root.right);
        while(!queue.isEmpty()) levelOrderTraversal(queue.poll());
    }

    private void inOrderTraversal(Node root){
        /*
        Algorithm
        1. Traverse the left subtree, i.e., call Inorder(left->subtree)
        2. Visit the root.
        3. Traverse the right subtree, i.e., call Inorder(right->subtree)
         */
        if (root == null) return;
        inOrderTraversal(root.left);
        System.out.println(root.data+ " ");
        inOrderTraversal(root.right);
    }
    public void printLevelOrder() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {

            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

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

    public static void main(String[] args) {
        //declaring the binary tree
        BinaryTreeImplementation bt = new BinaryTreeImplementation();
        bt.root = new Node(2);
        bt.add(2);
        bt.add(0);
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
    }
}

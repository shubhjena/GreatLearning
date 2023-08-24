package Week13_Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeImplementation {

    Node root;

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

    //inserting a node
    private void add(int value){
        addRecursively(root, value);
    }
    private Node addRecursively(Node current, int value){
        if (current == null) return new Node(value);

        else if (value < current.data)
            current.left = addRecursively(current.left, value);
        else if (value > current.data)
            current.right = addRecursively(current.right,value);

        return current;
    }

    //searching a node
    private Node search(Node root, int val){
        if (root == null) return null;
        else if (val == root.data) return root;
        else if (val < root.data) return search(root.left, val);
        else return search(root.right, val);
    }

    //traversal methods
    @SuppressWarnings("unused")
    public void levelOrderTraversal(Node root){
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
    @SuppressWarnings("unused")
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
    @SuppressWarnings("unused")
    private void preOrderTraversal(Node root){
        /*
        Algorithm Preorder(tree)
        1. Visit the root.
        2. Traverse the left subtree, i.e., call Preorder(left->subtree)
        3. Traverse the right subtree, i.e., call Preorder(right->subtree)
         */
        if (root == null) return;
        System.out.println(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    @SuppressWarnings("unused")
    private void postOrderTraversal(Node root){
        /*
            Algorithm Postorder(tree)
            1. Traverse the left subtree, i.e., call Postorder(left->subtree)
            2. Traverse the right subtree, i.e., call Postorder(right->subtree)
            3. Visit the root
         */
        if (root == null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.data+" ");
    }
    @SuppressWarnings("unused")
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
        int[] input = new int[]{2,0,6,4,8,3,5,7,9};
        bt.root = new Node(input[0]);
        for (int i = 1; i<input.length; i++){
            bt.add(input[i]);
        }
        bt.search(bt.root,5);

    }
}

package Week13_Trees;

import java.util.LinkedList;
import java.util.Queue;

public class KLevelNodes {
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

    public static void kLevelNode(Node node, int k){
        Queue<Node> queue = new LinkedList<>();
        int lvl=0;
        queue.add(node);
        queue.add(null);
        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();

            if (tempNode != null) {
                if (lvl==k) {
                    System.out.print(tempNode.data + " ");
                }

                /*Enqueue left child */
                if (tempNode.left != null) {
                    queue.add(tempNode.left);
                }

                /*Enqueue right child */
                if (tempNode.right != null) {
                    queue.add(tempNode.right);
                }
            }
            else if (!queue.isEmpty()){
                queue.add(null);
                lvl++;
            }
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

    public static void printTree(Node root){
        if (root == null)
            return;
        System.out.print(root.data+" ");
        printTree(root.left);
        printTree(root.right);
    }

    public static void main(String[] args) {
        int[] treeData = new int[]{1,7,2,0,3,9,4,10,5,11,6};
        KLevelNodes tree = new KLevelNodes();
        int k = 2;
        tree.root = new Node(k);
        for (int i: treeData){
            tree.add(i);
        }
        printTree(tree.root);
        System.out.printf("\nLevel %d nodes:\n",k);
        kLevelNode(tree.root,2);

    }
}

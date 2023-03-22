package Week13_Trees;

public class BinaryTreeImplementation {

    Node root;

    static class Node{
        int value;
        Node left;
        Node right;

        //constructor
        Node(int value){
            this.value = value;
            left = null;
            right = null;
        }
    }

    private Node addRecursively(Node current, int value){
        if (current == null) return new Node(value);

        else if (value < current.value)
            current.left = addRecursively(current.left, value);
        else if (value > current.value)
            current.right = addRecursively(current.right,value);

        return current;
    }

    private void add(int value){
        addRecursively(root, value);
    }

    public void main(String[] args) {
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

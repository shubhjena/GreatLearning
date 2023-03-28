package Week13_Trees.Practice_Problems;
//543. Diameter of Binary Tree
/*
Given the root of a binary tree, return the length of the diameter of the tree.

The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
This path may or may not pass through the root.

The length of a path between two nodes is represented by the number of edges between them.
 */
public class DiameterOfBinaryTree {
    public static class Pair{
        int diameter;
        int height;
        Pair(){}
        Pair(int diameter, int height){
            this.diameter = diameter;
            this.height = height;
        }
    }

  public static int diameterOfBinaryTree(TreeNode root) {
      Pair res = diameterOfBinaryTreeHelper(root);
      return res.diameter;
  }
  public static Pair diameterOfBinaryTreeHelper(TreeNode root) {
        if (root ==null) return new Pair(0,0);
        Pair left;
        Pair right;
        Pair result = new Pair();
        //get height and max diameter for the left and right subtree
        left = diameterOfBinaryTreeHelper(root.left);
        right = diameterOfBinaryTreeHelper(root.right);

        //store the height of the current node in result
        result.height = Math.max(left.height, right.height)+1;
        //storing maximum diameter in the subtree of current node
        result.diameter = Math.max(left.diameter, right.diameter);
        //comparing the diameter of current node to max dia of subtrees
        result.diameter = Math.max(result.diameter,(left.height+right.height));
        return result;
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        int[] input = new int[]{1,2};
        bt.root = new TreeNode(input[0]);
        for (int i=1;i< input.length; i++){
          bt.insertTreeNode(bt.root,input[i]);
        }
        System.out.println("Diameter of the given Tree is: ");
        System.out.println(diameterOfBinaryTree(bt.root));
    }
}

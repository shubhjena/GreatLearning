package Week13_Trees.Practice_Problems;
//257. Binary Tree Paths
/*
Given the root of a binary tree, return all root-to-leaf paths in any order.
A leaf is a node with no children.
 */
import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    static List<String> paths = new ArrayList<>();
    public static List<String> binaryTreePaths(TreeNode root) {
        path(root,new StringBuilder());
        return paths;
    }
    public static void path(TreeNode node, StringBuilder route){
        if(node == null) return;
        String val  = Integer.toString(node.val);
        route.append(val);
        if(node.left == null && node.right == null){
            paths.add(route.toString());
            route.setLength(route.length() - val.length());
            return;
        }
        route.append("->");
        path(node.left,route);
        path(node.right,route);
        if (route.length() > 3)
            route.setLength(route.length() - val.length()-2);
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        int[] input  = new int[]{1,2,3,0,5};
        bt.root = bt.insertLevelOrder(input,0);
        List<String> list;
        list = binaryTreePaths(bt.root);
        for (String s : list) {
            System.out.println(s);
        }
    }
}

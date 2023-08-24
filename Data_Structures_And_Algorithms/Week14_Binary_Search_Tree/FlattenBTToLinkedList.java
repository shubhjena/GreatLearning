package Week14_Binary_Search_Tree;

import com.sun.source.tree.Tree;

public class FlattenBTToLinkedList {
    public void flatten(TreeNode root) {
        root = flattenBSTIntoPreOrderLinkedList(root).front;
    }
    public class Pair{
        TreeNode front;
        TreeNode back;
        Pair(){}
        Pair(TreeNode f,TreeNode b){

        }
    }
    public Pair flattenBSTIntoPreOrderLinkedList(TreeNode root) {

        if(root == null) {
            return new Pair(null, null);
        }

        Pair leftLinkedList = flattenBSTIntoPreOrderLinkedList(root.left);
        Pair rightLinkedList = flattenBSTIntoPreOrderLinkedList(root.right);

        root.left = null;

        // combining root and left list.
        if(leftLinkedList.front != null) {
            root.right = leftLinkedList.front;
        } else {
            leftLinkedList.back = root;
        }

        leftLinkedList.front = root;

        // combining whole list with right list.
        leftLinkedList.back.right = rightLinkedList.front;

        if(rightLinkedList.back !=null) {
            leftLinkedList.back = rightLinkedList.back;
        }

        return new Pair(leftLinkedList.front, leftLinkedList.back);

    }
    //post order approach
    TreeNode prev = null;
    public void flatten1(TreeNode root) {
        if (root == null) return;
        flatten1(root.right);
        flatten1(root.left);

        root.right=prev;
        root.left=null;
        prev=root;
    }
}

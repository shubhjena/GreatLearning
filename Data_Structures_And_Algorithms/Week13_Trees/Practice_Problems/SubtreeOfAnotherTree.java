package Week13_Trees.Practice_Problems;
//572. Subtree of Another Tree
/*
Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the same
structure and node values of subRoot and false otherwise.

A subtree of a binary tree 'tree' is a tree that consists of a node in tree and all of this node's descendants.
The tree 'tree' could also be considered as a subtree of itself.
 */

public class SubtreeOfAnotherTree {
    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        //the root is null, or we have reached the leaf node
        if(root ==  null || subRoot ==null) return (subRoot== null)&&(root==null);

        //the root of subtree matches current node of tree
        if(root.val == subRoot.val){
            //returns true only if all subtrees match
            if(isSubtreeHelper(root,subRoot)) return true;
            //when false the recursion resumes from children of node which matched the root of subtree
        }
        return (isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot) );
    }
    //method to check if subsequent nodes match once the root node of subtree has matched
    public static boolean isSubtreeHelper(TreeNode root, TreeNode subRoot) {
        if(root ==  null || subRoot ==null) return (subRoot== null)&&(root==null);
        if(root.val == subRoot.val){
            //return true only if both left and right subtrees are a match
            return (isSubtreeHelper(root.left,subRoot.left) &&
                    isSubtreeHelper(root.right,subRoot.right) );
        }
        return false;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] input = new int[]{1,2};
        tree.root = new TreeNode(input[0]);
        for (int i=1;i< input.length; i++){
          tree.insertTreeNode(tree.root,input[i]);
        }
        BinaryTree subtree = new BinaryTree();
        int[] inputSubtree = new int[]{1,2};
        subtree.root = new TreeNode(inputSubtree[0]);
        for (int i=1;i< input.length; i++){
            subtree.insertTreeNode(subtree.root,inputSubtree[i]);
        }
        boolean isPresent = isSubtree(tree.root,subtree.root);
        System.out.println(isPresent);
    }
}


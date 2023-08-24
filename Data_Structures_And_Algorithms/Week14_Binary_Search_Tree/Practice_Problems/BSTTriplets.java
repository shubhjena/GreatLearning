package Week14_Binary_Search_Tree.Practice_Problems;

import java.util.ArrayList;
import java.util.Scanner;

//BST- Triplets - Great Learning - Graded Assessment 3
/*
Given a BST containing positive integers of size n nodes and a target value. Your task is to find a triplet
whose sum will be equal to the given target.
Please note:
 - In the triplet repetition of a node is not allowed.
 - If multiple triplets are available then display all the triplets.
 - If triplet does not exist, display the message "No Triplet Exists".
 */
public class BSTTriplets {
    static class Node {
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    static class BinarySearchTree {
        Node root;
        void insert(int data) {
            root = insertRec(root, data);
        }
        Node insertRec(Node root, int data) {
            if (root == null) {
                root = new Node(data);
                return root;
            }
            if (data < root.data)
                root.left = insertRec(root.left, data);
            else if (data > root.data)
                root.right = insertRec(root.right, data);
            return root;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        void inOrderTraversal(Node root){
            if (root == null) return;
            inOrderTraversal(root.left);
            arr.add(root.data);
            inOrderTraversal(root.right);
        }
        void findGroupOfThreeNodes(int target) {
            inOrderTraversal(root);
            if (arr.size()<3){
                System.out.println("No Triplet Exists");
                return;
            }
            boolean flag = false;
            for (int i = 0; i < arr.size()-2; i++) {
                int j=i+1, k=arr.size()-1;
                while (j<k){
                    if(arr.get(i)+ arr.get(j)+ arr.get(k) == target){
                        System.out.println(arr.get(i)+" "+ arr.get(j)+" "+arr.get(k));
                                flag = true;
                        j++; k--;
                    }
                    else if (arr.get(i)+ arr.get(j)+ arr.get(k) < target) j++;
                    else k--;
                }
            }
            if(!flag) System.out.println("No Triplet Exists");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            bst.insert(data);
        }
        int target = sc.nextInt();
        bst.findGroupOfThreeNodes(target);
    }
}

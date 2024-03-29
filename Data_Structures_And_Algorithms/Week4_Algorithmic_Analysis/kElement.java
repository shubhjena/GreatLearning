package Week4_Algorithmic_Analysis;
/*
Problem Statement: Given an array and a number K where K is smaller than the size of the array.
Find the Kth smallest element in the given array. Given that all array elements are distinct.
 */

import java.util.Arrays;

public class kElement {
    public static void main(String[] args) {
        int[] arr =  { 7, 10, 4, 3, 20, 15 };
        int k = (int) (Math.random()*(arr.length)+1);
        Arrays.sort(arr);
        for (int a:arr){
            System.out.print(a+" ");
        }
        System.out.println("\nK="+k);
        System.out.println("Kth largest element: "+arr[(arr.length-k)]);
        System.out.println("Kth smallest element: "+arr[k-1]);
    }
}

package Week11_Hashing_and_Bit_manipulation.Hashing;
//349. Intersection of Two Arrays
/*
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must be unique and you may return the result in any order.
 */
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i: nums1)
            set1.add(i);

        for(int j: nums2){
            if(set1.contains(j))
                set2.add(j);
        }
        int[] arr = new int[set2.size()];
        int i=0;
        for(Integer e: set2){
            arr[i++] = e;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{7,3,9};
        int[] arr2 = new int[]{6,3,9,2,4};
        System.out.println("Intersection of the arrays is: "+ Arrays.toString(intersection(arr1, arr2)));
    }
}

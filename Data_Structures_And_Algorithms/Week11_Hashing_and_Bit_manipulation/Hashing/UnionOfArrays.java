package Week11_Hashing_and_Bit_manipulation.Hashing;

import java.util.HashSet;

/*
Find the total number of unique elements in two arrays.
 */
public class UnionOfArrays {
    static int unionOfArrays(int[] arr1, int[] arr2){
        HashSet<Integer> union = new HashSet<>();
        for (int i: arr1)
            union.add(i);
        for (int j: arr2)
            union.add(j);
        return union.size();
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{7,3,9};
        int[] arr2 = new int[]{6,3,9,2,4};
        System.out.println("Number of unique elements are: "+ unionOfArrays(arr1, arr2));
    }
}

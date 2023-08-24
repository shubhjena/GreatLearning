package Week14_Binary_Search_Tree;

import java.util.HashSet;

public class NewClass {

//    3, 4, -7, 3, 1, 3, 1, -4, -2, -2
//        i            j
//        7            s
//   0, 3, 7, 0, 3, 4, 7, 8, 4, 2, 0
//    Given an integer array, check if it contains a subarray having zero-sum.
//    int sum = 0; -7
//    {0, 3, 7,   }
    public static boolean  zeroSubarray(int[] nums){
        HashSet<Integer> set = new HashSet<>(); //set to store previous sums

        set.add(0);
        //sum variable to store the sum till current element
        int sum = 0;
        for (int i: nums){
            sum+=i;
            if (set.contains(sum))
                return true;
            set.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {
        int[]  nums = new int[]{4, -6, 3, -1, 4, 2, 7};
        System.out.println(zeroSubarray(nums));
    }

}

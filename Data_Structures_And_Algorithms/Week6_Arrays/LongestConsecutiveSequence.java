package Week6_Arrays;
//Longest Consecutive Sequence in an Array
/*
You are given an array of ‘N’ integers. You need to find the length of the
longest sequence which contains the consecutive elements.
 */
import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {100, 200, 1, 3, 2, 4};
        System.out.println("Longest Consecutive Sequence");
        System.out.println(sequenceFinder(arr));
    }
    static int sequenceFinder(int[] nums){
        int size= nums.length;
        if (size==0)
            return 0;
        Arrays.sort(nums);
        int res=1, count=0;
        for (int i = 1; i < size; i++) {
            if (nums[i-1]+1==nums[i])
                count++;
            else if(nums[i-1]==nums[i])
                continue;
            else
                count=0;
            res = Math.max(res,count+1);
        }
        return res;
    }
}

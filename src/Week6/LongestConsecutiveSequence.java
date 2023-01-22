package Week6;
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
    static int sequenceFinder(int[] arr){
        Arrays.sort(arr);
        int res=1, count=0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1]+1==arr[i])
                count++;
            else
                count=0;
            res = Math.max(res,count+1);
        }
        return res;
    }
}

package Week11_Hashing_and_Bit_manipulation.Bit_Manipulation;
//https://practice.geeksforgeeks.org/problems/finding-the-numbers0215/1
//Non-Repeating Numbers
/*
Given an array A containing 2*N+2 positive numbers, out of which 2*N numbers exist in pairs
whereas the other two number occur exactly once and are distinct. Find the other two numbers.
Return in increasing order.
 */

public class NonRepeatingNumbers {
    public static int[] singleNumber(int[] nums)
            //XOR al elements
    {   int res = 0;
        for(int i: nums){
            res^=i;
        }
        int temp1=0, temp2 = 0;
        //res is the XOR of the two distinct numbers.
        //find the first set-bit in res
        res = res & -res;

        for(int i: nums){
            //XOR all the elements with 1 at the set bit position
            if((res & i) >0)
                temp1^=i;

            //XOR all the elements with 0 at the set bit position
            else
                temp2^=i;
        }
        return (temp1>temp2)?new int[]{temp2,temp1}:new int[]{temp1,temp2};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,2,3};
        int[] res = singleNumber(nums);
        for (int i: res) System.out.print(i + " ");
    }
}

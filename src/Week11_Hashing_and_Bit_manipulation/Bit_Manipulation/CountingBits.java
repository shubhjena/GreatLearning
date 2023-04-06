package Week11_Hashing_and_Bit_manipulation.Bit_Manipulation;

import java.util.Arrays;

//338. Counting Bits
/*
Given an integer n, return an array ans of length n + 1 such that
for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
 */
public class CountingBits {
    public static int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0; i<=n; i++){
            int count = 0,j=i;
            while(j>0){
                j = j & (j-1);
                count++;
            }
            ans[i] = count;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 23;
        int[] res = countBits(n);
        System.out.println(Arrays.toString(res));
    }
}

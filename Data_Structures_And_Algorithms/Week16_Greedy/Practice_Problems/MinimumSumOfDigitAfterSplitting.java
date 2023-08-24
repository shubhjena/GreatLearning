package Week16_Greedy.Practice_Problems;

import java.util.Arrays;

//2160. Minimum Sum of Four Digit Number After Splitting Digits
/*
You are given a positive integer num consisting of exactly four digits. Split num into two new integers
new1 and new2 by using the digits found in num. Leading zeros are allowed in new1 and new2, and all the
digits found in num must be used.
For example, given num = 2932, you have the following digits: two 2's, one 9 and one 3. Some possible
pairs [new1, new2] are [22, 93], [23, 92], [223, 9] and [2, 329].
Return the minimum possible sum of new1 and new2.
 */
public class MinimumSumOfDigitAfterSplitting {
    public static int minimumSum(int num) {
        int[] arr = new int[4];
        int i=0;
        while(num>0){
            arr[i++] = num%10;
            num/=10;
        }
        Arrays.sort(arr);
        return arr[0]*10 + arr[1]*10 + arr[2] + arr[3];
    }

    public static void main(String[] args) {
        int num = 2932;
        System.out.println("minimum possible sum of digits split into two numbers is: "+ minimumSum(num));
    }
}

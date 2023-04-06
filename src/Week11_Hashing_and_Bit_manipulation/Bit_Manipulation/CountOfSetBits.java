package Week11_Hashing_and_Bit_manipulation.Bit_Manipulation;
//https://practice.geeksforgeeks.org/problems/set-bits0143/1
//Number of 1 Bits
/*
Given a positive integer N, print count of set bits in it.
 */
public class CountOfSetBits {
    static int setBits(int N) {
        int count =0;
        while(N != 0){
            N = N & (N-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 100;
        System.out.println(setBits(num));
    }
}

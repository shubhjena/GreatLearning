package Week11_Hashing_and_Bit_manipulation.Bit_Manipulation;

public class PowerOf2 {
    public static boolean isPowerOfTwo(long n){
        if(n<=0) return false;
        //if the binary number has more than 1 set bit it cannot be expressed as power of 2
        return (n & (n-1)) == 0;
    }

    public static void main(String[] args) {
        int n = 1;
        if (isPowerOfTwo(n))
            System.out.println("YES - The number can be expressed as power of 2.");
        else
            System.out.println("NO - The number cannot be expressed as power of 2.");
    }
}

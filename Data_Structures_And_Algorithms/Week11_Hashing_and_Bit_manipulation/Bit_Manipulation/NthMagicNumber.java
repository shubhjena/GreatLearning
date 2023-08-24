package Week11_Hashing_and_Bit_manipulation.Bit_Manipulation;

import java.util.Scanner;

public class NthMagicNumber {
    static int nthMagicNo(int n) {
        int magicNum = 0;
        int pos = 0;
        while(n>0){
            pos++;
            if ((n&1) == 1)
                magicNum += Math.pow(5,pos);
            n = n>>1;
        }
        return magicNum;
    }

    public static void main(String[] args) {
        System.out.println("Enter 'N' to get the Nth magic number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("The %dth magic number is ",n);
        System.out.println(nthMagicNo(n));
    }
}

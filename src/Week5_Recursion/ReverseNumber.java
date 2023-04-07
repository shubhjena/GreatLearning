package Week5_Recursion;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    reverseNumber(num);
    }
    public static int reverseNumber(int num){
        if(num==0)
            return 0;
        System.out.print(num%10);
        return reverseNumber(num/10);
    }
}

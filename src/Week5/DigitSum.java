package Week5;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(digitSum(num));
    }

    public static int digitSum(int num) {
        if (num==0)
            return 0;
        return num%10+digitSum(num/10);
    }
}

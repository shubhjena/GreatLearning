package Week5_Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter the number to calculate the factorial=");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num+"!= "+factorial(num));
    }
    public static int factorial(int num){
        if(num==0||num==1)
            return 1;
        return num*factorial(num-1);
    }
}

package Week5;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        System.out.println("Highest Common factorial Calculator.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.printf("HCF for %d & %d = %d",num1,num2, hcfCalculator(num1,num2));
    }
    public static int hcfCalculator(int num1, int num2){
        if(num2==0)
            return num1;
        return hcfCalculator(num2,num1%num2);
    }
}

package Week5;

import java.util.Scanner;

public class ReverseNumber {
    static int revNum=0;
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    reverseNumber(num);
    System.out.println(revNum);
    }
    public static int reverseNumber(int num){
        if(num==0)
            return 0;
        revNum= revNum*10+num%10;
        return reverseNumber(num/10);
    }
}

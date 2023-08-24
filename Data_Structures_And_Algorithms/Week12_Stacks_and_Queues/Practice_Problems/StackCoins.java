package Week12_Stacks_and_Queues.Practice_Problems;

import java.util.Scanner;

//Stack coins - Great Learning - Graded Assessment 3
/*
It's your birthday, and you have received N coins from various well-wishers. All the coins are identical. To
count the number of coins, you started making stacks of coins. The first stack you made has one coin, and
all other stacks have one coin more than the previous stack. You continued this until you run out of coins. As
a result, only the last stack may have a number of coins less than or equal to the number of coins in the
previous stack. If N is known to you, can you predict how many stacks you will make?
 */
public class StackCoins {
    public static void birthday(int n) {
        if(n <= 0) System.out.println("No stack can be formed");
        else{
            int sum =0,k=1;
            while(sum<n) {
                sum+=k;
                k++;
            }
            System.out.println(k-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print(" Enter the number of coins received on birthday: ");
        int n = sc.nextInt();
        System.out.println("Number of stack formed are: ");
        birthday(n);
    }
}

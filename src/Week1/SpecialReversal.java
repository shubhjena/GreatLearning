package Week1;

import java.util.*;

public class SpecialReversal {
//  k   k   k   k   k
//a b c d e f g h i j
//0 1 2 3 4 5 6 7 8 9
    public static void reverseStr(String str, int k){
        int s=0,l=0;
        int length = str.length();
        while (s < length){
            l+=k;
            if (l%(2*k)==0){
                System.out.println(str.charAt(s));
                s++;
            }
            else if (l%(k)==0){
                System.out.println(str.charAt(s));
                s--;
            }
            else{
                System.out.println(str.charAt(s));
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String then enter value of K:");
        reverseStr(sc.nextLine(),sc.nextInt());
    }
}
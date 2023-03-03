package Week10_Strings;

import java.util.Scanner;
public class RomanToInt {
    public static int romanToInt(String s) {
        int val=0,number=0, last=1000;
        for (int i=0; i<s.length(); i++) {
            switch (s.charAt(i)) {
                case 'M' -> val = 1000;
                case 'D' -> val = 500;
                case 'C' -> val = 100;
                case 'L' -> val = 50;
                case 'X' -> val = 10;
                case 'V' -> val = 5;
                case 'I' -> val = 1;
            }
            if (last<val) number+=val-2*last;
            else number+=val;
            last=val;
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.print("Enter roman number(CAPITAL):");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(romanToInt(s));
    }
}


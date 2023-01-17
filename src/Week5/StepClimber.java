package Week5;

import java.util.Scanner;

public class StepClimber {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numSteps = sc.nextInt();
        stepClimber(numSteps);
        System.out.println(count);
    }
    public static void stepClimber(int num){
        if (num<=0) {
            count++;
            return;
        }
        stepClimber(num-1);
        if (num>=2)
            stepClimber(num-2);
    }
}

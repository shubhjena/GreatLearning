package Week5;

import java.util.Scanner;

public class StepClimber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numSteps = sc.nextInt();
        System.out.println(stepClimber(numSteps));
    }
    public static int stepClimber(int num){
        int count =0;
        if (num<=0) {
            return 1;
        }
        count+= stepClimber(num-1);
        if (num>=2)
            count+= stepClimber(num-2);
        return count;
    }
}

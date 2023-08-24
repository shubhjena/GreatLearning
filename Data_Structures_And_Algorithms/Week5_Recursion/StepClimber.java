package Week5_Recursion;

import java.util.Scanner;

public class StepClimber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numSteps = sc.nextInt();
        System.out.println(stepClimber(numSteps));
    }
    /*
    To count the total no of ways we can climb the steps where we can take either one step or two steps at a time.
    -Option1 - Take 1-step and call recursively for remaining steps.
    -Option2 - Take 2-Steps then call recursively for remaining steps.
    -Every time we reach to the top count is updated.
     */
    public static int stepClimber(int num){
        int count =0;
        if (num<=0) {
            return 1; //All steps complete
        }
        count+= stepClimber(num-1); //Taking one step
        if (num>=2)
            count+= stepClimber(num-2); //If 2 or more steps are available take 2 steps
        return count;
    }
}

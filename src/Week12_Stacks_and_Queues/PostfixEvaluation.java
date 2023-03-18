package Week12_Stacks_and_Queues;

import java.util.*;

public class PostfixEvaluation {
    static int postfixEvaluation(String postfix){
        Stack<Integer> opStack = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            if (Character.isLetterOrDigit(ch))
                opStack.push(ch-'0');
            else{
                int temp = opStack.pop();
                if (opStack.isEmpty()) return -1;
                opStack.push(operate(opStack.pop(),temp,ch));
            }
        }
        return opStack.pop();
    }

    private static Integer operate(Integer op1, int op2, char ch) {
        return switch (ch) {
            case '+' -> op1 + op2;
            case '-' -> op1 - op2;
            case '/' -> op1 / op2;
            case '*' -> op1 * op2;
            case '^' -> (int)Math.pow(op1,op2);
            default -> -1;
        };
    }

    public static void main(String[] args) {
        String postfix = "5402+/4*+25+-2/";
        int result = PostfixEvaluation.postfixEvaluation(postfix);
        System.out.println(result);
    }
}

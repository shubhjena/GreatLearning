package Week12_Stacks_and_Queues;

import java.util.Stack;

public class PostfixToInfix {
    static String postfixToInfix(String postfix){
        Stack<String> opStack = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            if (Character.isLetterOrDigit(ch))
                opStack.push(ch+"");
            else {
                String temp = opStack.pop();
                //if only one operand is left expression must be invalid
                if (opStack.isEmpty()) return "Invalid expression";
                opStack.push("("+opStack.pop()+ch+temp+")");
            }
        }
        return opStack.pop();
    }

    public static void main(String[] args) {
        String postfix = "abcm^n+/-";
        String infix = PostfixToInfix.postfixToInfix(postfix);
        System.out.println(infix);
    }
}

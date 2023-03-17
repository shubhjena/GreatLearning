package Week12_Stacks_and_Queues;
/*
Create an operator stack.

     Loop all characters of Infix expression and store it in variable 'ch'

if ch is operand, add it to postfix
else if ch is '(', push it onto the stack
else if ch is ')', pop and add to the postfix till the stack is not empty and the top becomes '('. Pop again.
else pop and add to postfix till stack is not empty and precedence of ch is less than precedence of stack top. Push ch.
    While the stack is not empty, pop and add to postfix.

    Return postfix.
 */

import java.util.Stack;

public class InfixToPostfix {
    static String infixToPostfix(String infix){
        StringBuilder postfix = new StringBuilder();
        Stack<Character> opStack = new Stack<>();
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            if (Character.isLetterOrDigit(ch))
                postfix.append(ch);
            else if (ch == '(')
                opStack.push(ch);
            else if (ch == ')') {
                while (!opStack.isEmpty() && opStack.peek() == '(')
                    postfix.append(opStack.pop());
            }
            else {
                while (!opStack.isEmpty() && (precedence(ch)<precedence(opStack.peek())))
                    postfix.append(opStack.pop());
                opStack.push(ch);
            }
        }
        while (!opStack.isEmpty())
            postfix.append(opStack.pop());
        return postfix.toString();
    }

    private static int precedence(char ch) {
        //to be completed
        return 0;
    }
}

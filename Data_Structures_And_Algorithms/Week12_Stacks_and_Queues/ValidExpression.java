package Week12_Stacks_and_Queues;
//https://www.codingninjas.com/codestudio/problems/redundant-brackets_975473?leftPanelTab=0
//Redundant Brackets
/*
Mathematical expression is valid and contains only ( ) + - * / and lower case characters.
Return true if expression has redundant parentheses.
 */
import java.util.*;

public class ValidExpression {
    public static boolean validExpression(String expression) {
        //stack to store the expression till ')' is encountered
        Stack<Character> stk = new Stack<>();
        char[] chArr = expression.toCharArray();
        for (char ch : chArr) {
            if(ch!=')')
                //push all characters till ')'
                stk.push(ch);
            else {
                int count = 0;
                boolean flag = true;

                //curr ch is ')' so pop all elements till '(' is encountered
                while(!stk.isEmpty() && stk.peek()!='('){
                    if(!Character.isLetterOrDigit(stk.peek())) flag = false; //the popped elements contain operators
                    stk.pop();
                    count++;
                }
                if(!stk.isEmpty()) stk.pop(); //to pop the '(' remaining
                //redundant parentheses if no or a single non-operator element is present b/w brackets
                if (count<=1 && flag) return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String[] expressions = new String[]{"(a+c*b)+(c))","(a*b+(c/d))","((a/b))"};
        System.out.println("Does the expression have redundant parentheses?");
        for (String expression: expressions) {
            System.out.printf("%s - ",expression);
            if (validExpression(expression))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}

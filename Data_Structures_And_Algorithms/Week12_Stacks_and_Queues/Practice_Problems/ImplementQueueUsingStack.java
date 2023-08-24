package Week12_Stacks_and_Queues.Practice_Problems;
//232. Implement Queue using Stacks
/*
Implement a first in first out (FIFO) queue using only two stacks.
The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).

Implement the MyQueue class:

void push(int x) Pushes element x to the back of the queue.
int pop() Removes the element from the front of the queue and returns it.
int peek() Returns the element at the front of the queue.
boolean empty() Returns true if the queue is empty, false otherwise.
 */
import java.util.*;

public class ImplementQueueUsingStack {
    Stack<Integer> stk1;
    Stack<Integer> stk2;

    public ImplementQueueUsingStack() {
        stk1 = new Stack<>();
        stk2 = new Stack<>();
    }
    /** to push to the end reverse the stack into second stack and push on top*/
    public void push(int x) {
        while(!stk1.isEmpty())
            stk2.push(stk1.pop());
        stk2.push(x);
        /** revert the stack back to original stack after push operation is completed*/
        while(!stk2.isEmpty())
            stk1.push(stk2.pop());
    }

    public int pop() {
        return stk1.pop();
    }

    public int peek() {
        return stk1.peek();
    }

    public boolean empty() {
        return stk1.isEmpty();
    }

    public static void main(String[] args) {
        ImplementQueueUsingStack obj = new ImplementQueueUsingStack();
        for (int i=0; i<5; i++) {
            obj.push((int) Math.pow(i,2));
        }
        System.out.println(obj.pop());
        System.out.println(obj.peek());
        System.out.println(obj.peek());
        System.out.println(obj.empty());
    }
}




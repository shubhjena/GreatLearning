package Week12_Stacks_and_Queues.Practice_Problems;
//225. Implement Stack using Queues
/*
Implement a last-in-first-out (LIFO) stack using only two queues.
The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).

Implement the MyStack class:

void push(int x) Pushes element x to the top of the stack.
int pop() Removes the element on the top of the stack and returns it.
int top() Returns the element on the top of the stack.
boolean empty() Returns true if the stack is empty, false otherwise.
 */
import java.util.*;

public class ImplementStackUsingQueues {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public ImplementStackUsingQueues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        while(!q1.isEmpty())
            q2.offer(q1.poll());
        q1.offer(x);
        while(!q2.isEmpty())
            q1.offer(q2.poll());
    }

    public int pop() {
        if(empty()) return -1;
        return q1.poll();
    }

    public int top() {
        if(empty()) return -1;
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        ImplementStackUsingQueues obj = new ImplementStackUsingQueues();
        obj.push(8);
        obj.push(4);
        obj.push(2);
        obj.push(1);
        System.out.println("Top: "+obj.top());
        System.out.println("Pop: "+obj.pop());
    }
}

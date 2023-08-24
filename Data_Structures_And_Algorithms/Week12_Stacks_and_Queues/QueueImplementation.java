package Week12_Stacks_and_Queues;
import java.util.*;

public class QueueImplementation {
    static class MyQueue {
        // store elements
        private final List<Integer> data;
        // a pointer to indicate the start position
        private int p_start;
        public MyQueue() {
            data = new ArrayList<>();
            p_start = 0;
        }
        /** Insert an element into the queue. Return true if the operation is successful. */
        public boolean enQueue(int x) {
            data.add(x);
            return true;
        }
        /** Delete an element from the queue. Return true if the operation is successful. */
        public boolean deQueue() {
            if (isEmpty()) {
                return false;
            }
            p_start++;
            return true;
        }
        /** Get the front item from the queue. */
        public int Front() {
            return data.get(p_start);
        }
        /** Checks whether the queue is empty or not. */
        public boolean isEmpty() {
            return p_start >= data.size();
        }
    }

    public static class Main {
        public static void main(String[] args) {
            MyQueue q = new MyQueue();
            System.out.println(q.enQueue(5));
            System.out.println(q.enQueue(3));
            if (q.isEmpty()) {
                System.out.println(q.Front());
            }
            System.out.println(q.deQueue());
            if (q.isEmpty()) {
                System.out.println(q.Front());
            }
            System.out.println(q.deQueue());
            if (q.isEmpty()) {
                System.out.println(q.Front());
            }
        }
    }
}

package Week12_Stacks_and_Queues;

public class CircularQueueImplementation {
    static class MyCircularQueue {

        private final int[] data;
        private int head;
        private int tail;
        private final int size;

        /** Initialize your data structure here. Set the size of the queue to be k. */
        public MyCircularQueue(int k) {
            data = new int[k];
            head = -1;
            tail = -1;
            size = k;
        }

        /** Insert an element into the circular queue. Return true if the operation is successful. */
        public boolean enQueue(int value) {
            if (isFull()) {
                return false;
            }
            if (isEmpty()) {
                head = 0;
            }
            tail = (tail + 1) % size;
            data[tail] = value;
            return true;
        }

        /** Delete an element from the circular queue. Return true if the operation is successful. */
        public boolean deQueue() {
            if (isEmpty()) {
                return false;
            }
            if (head == tail) {
                head = -1;
                tail = -1;
                return true;
            }
            head = (head + 1) % size;
            return true;
        }

        /** Get the front item from the queue. */
        public int Front() {
            if (isEmpty()) {
                return -1;
            }
            return data[head];
        }

        /** Get the last item from the queue. */
        public int Rear() {
            if (isEmpty()) {
                return -1;
            }
            return data[tail];
        }

        /** Checks whether the circular queue is empty or not. */
        public boolean isEmpty() {
            return head == -1;
        }

        /** Checks whether the circular queue is full or not. */
        public boolean isFull() {
            return ((tail + 1) % size) == head;
        }
    }

    public static void main(String[] args) {
        MyCircularQueue obj = new MyCircularQueue(5);
        System.out.println(obj.enQueue(5));
        System.out.println(obj.enQueue(6));
        System.out.println(obj.enQueue(3));
        System.out.println(obj.deQueue());
        System.out.println(obj.Front());
        System.out.println(obj.Rear());
    }
}

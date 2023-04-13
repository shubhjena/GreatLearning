package Week15_Heaps;

public class MaxHeap {
    private final int[] heap; // array
    private final int size;
    private final int maxsize;

    public MaxHeap(int size) {
        this.maxsize = size;
        this.size = 0;
        heap = new int[this.maxsize + 1];
        heap[0] = Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        MaxHeap obj = new MaxHeap(7);

    }
}

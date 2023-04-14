package Week15_Heaps;

public class MaxHeap {
    private int[] heap; // array
    private int size;
    private int maxsize;

    public MaxHeap(int size) {
        this.maxsize = size;
        this.size = 0;
        heap = new int[this.maxsize + 1];
        heap[0] = Integer.MAX_VALUE;
    }

    public void heapify(int num){
        if(size == maxsize) return;
        size++;
        if (size == 1){
            heap[0] = num;
            return;
        }
        int parent = (size-2)/2;
        if (parent > 0 && heap[size-1]>heap[parent]){
            int temp = heap[size-1];
            heap[size-1] = heap[parent];
            heap[parent] = temp;
            heapify(heap[parent]);
        }

    }

    public static void main(String[] args) {
        MaxHeap obj = new MaxHeap(7);

    }
}

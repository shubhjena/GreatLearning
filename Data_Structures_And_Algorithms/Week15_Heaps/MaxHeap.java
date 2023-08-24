package Week15_Heaps;

public class MaxHeap {
    private final int[] heap; // array
    private int size;
    private final int maxsize;

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
    void insert(int Key)
    {
        // Increase the size of Heap by 1
        size++;
        int i = size-1;
        // Insert the element at end of Heap
        heap[i] = Key;

        // Heapify the new node following a Bottom-up approach
        while (i>0 && heap[parent(i)] < heap[i]){
            swap(i,parent(i));
            i = parent(i);
        }

    }
    private void swap(int i, int j){
        int temp  = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
    private int parent(int i) {
        return (i-1)/2;
    }

    public static void main(String[] args) {
        MaxHeap obj = new MaxHeap(7);
        int num = 6;
        obj.heapify(5);
        obj.insert(num);
    }
}

package Week1_Streams.MyArrayList;

import java.util.Arrays;

public class MyArrayList implements MyList {
   int[] arr;
   int size;
   int capacity = 10;

    public MyArrayList() {
        arr = new int[capacity];
        size = 0;
    }
    @Override
    public void add(int element){
        if(size==capacity){
            enhanceCapacity(2);
        }
        arr[size++] = element;

    }

    @Override
    public void add(int element, int index) {
        if(size==capacity){
            enhanceCapacity(2);
        }
        int[] temp = new int[capacity];
        if (index-1 >= 0) System.arraycopy(arr, 0, temp, 0, index-1);
        temp[index] = element;
        if (size-index >= 0) System.arraycopy(arr, index, temp, index+1, size-index);
        arr = temp;
    }

    @Override
    public int get(int index) {
        return arr[index];
    }

    @Override
    public void delete() {
        size--;
    }

    public void enhanceCapacity(int minCapacity){
        int[] temp = new int[capacity*minCapacity];
        if (size >= 0) System.arraycopy(arr, 0, temp, 0, size);
        arr = temp;
        capacity = arr.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr) ;
    }
}

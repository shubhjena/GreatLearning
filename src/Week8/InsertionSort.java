package Week8;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[]  arr = {1,-1,-2,8,-9};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted Array: "+ Arrays.toString(arr));

    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while ( j >=0 && arr[j]>key) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}

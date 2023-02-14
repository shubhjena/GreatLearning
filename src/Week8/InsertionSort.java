package Week8;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[]  arr = {1,2,3,6,5,4,7,9,8};
        insertionSort(arr);
        System.out.println("Sorted Array: "+ Arrays.toString(arr));

    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            for (int j = i-1; j >=0 ; j--) {
                if (arr[j]>arr[i])
                    arr[j+1]=arr[j];
                else {
                    arr[j+1]=key;
                    break;
                }
            }
        }
    }
}

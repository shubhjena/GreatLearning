package Week8;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[]  arr = {1,2,3,6,5,4,7,9,8};
        selectionSort(arr);
        System.out.println("Sorted Array: "+ Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int curMin = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[curMin]>arr[j])
                    curMin = j;
            }
            swap(arr,i,curMin);
        }
    }
    private static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}

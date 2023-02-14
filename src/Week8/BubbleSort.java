package Week8;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[]  arr = {1,2,3,6,5,4,7,9,8};
        bubbleSort(arr);
        System.out.println("Sorted Array: "+ Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j]>arr[j+1])
                    swap(arr,j,j+1);
            }
        }
    }
    private static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}

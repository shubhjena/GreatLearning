package Week9_Searching_and_Sorting.DiscussionProblems;

import java.util.Arrays;

public class WaveArray {
    public static void waveArray(int[] arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i+=2) {
            swap(arr,i,i+1);
        }
    }
    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}

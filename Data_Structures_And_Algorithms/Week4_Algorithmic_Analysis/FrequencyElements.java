package Week4_Algorithmic_Analysis;
/*
Given an Array which may contain duplicates, print all elements and their frequencies.
 */

import java.util.Arrays;

public class FrequencyElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20};
        frequencyFinder(arr);
    }
    static void frequencyFinder(int[] arr){
        Arrays.sort(arr);
        int current = arr[0],freq=0;
        for (int i = 0; i < arr.length; i++) {
            if(current != arr[i]){
                System.out.println(current+": "+freq);
                current=arr[i];
                freq=1;
            } else if (i== arr.length-1) {
                System.out.println(current+": "+(++freq));
            }
            else if (current == arr[i]){
                freq++;
            }

        }
    }
}

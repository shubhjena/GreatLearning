package Week8_Searching_and_Sorting.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search:");
        int element = sc.nextInt();
        int[] arr = {5,6,1,8,9,3,-4,-5,0};
        System.out.println("Found at index: "+LinearSearch.search(arr,0,arr.length-1, element));
        Arrays.sort(arr);
        System.out.println("Found at index: "+BinarySearch.search(arr,0,arr.length-1, element)+" in sorted array.");
    }
}


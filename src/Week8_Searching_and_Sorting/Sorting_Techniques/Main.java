package Week8_Searching_and_Sorting.Sorting_Techniques;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter the elements of array separated by space \" \"");
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i=0; i<input.length;i++){
            arr[i] = Integer.parseInt(input[i]);
        }
        System.out.println("Array before Sorting:\n"+Arrays.toString(arr));
        new BubbleSort().sort(arr,0, arr.length-1);
        new SelectionSort().sort(arr,0, arr.length-1);
        new InsertionSort().sort(arr,0, arr.length-1);
        new MergeSort().sort(arr,0, arr.length-1);
        System.out.println("Array after Sorting:\n"+Arrays.toString(arr));
    }
}

package Week11_Hashing_and_Bit_manipulation.Bit_Manipulation;

import java.util.Arrays;

//Binary Sort - Great Learning - Graded Assessment 3
/*
You are given an array of integers. You have to re-arrange the array based on the number of 1's in the
binary representations of the integers.
1. Sort integers in descending order based on the number of 1's in their binary representation.
   Example: 13(1101) will come before 3(0011).
2. If two or more numbers have an equal number of 1's, then sort them in ascending order.
 */
public class BinarySorting {
    int n;
    int[] arr;
    BinarySorting(int n, int[] arr){
        this.n = n;
        this.arr = arr;
    }
    void performBinarySorting(){
        if(n ==0) System.out.println("Sorting Not Possible");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(getOnes(arr[j-1]) < getOnes(arr[j]))
                    swap(j-1,j);
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private int getOnes(int n){
        int count=0;
        while(n>0){
            n = n&(n-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 6, 9, 13, 15};
        int n = arr.length;
        BinarySorting obj = new BinarySorting(n,arr);
        obj.performBinarySorting();
    }
}

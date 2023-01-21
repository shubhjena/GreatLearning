package Week4;
/*
An array contains both positive and negative numbers in random order.
Rearrange the array elements so that all negative numbers appear before all positive numbers.
 */

public class NegativeSort {
    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        negativeSeparate(arr);
        System.out.println();
        negativeSort(arr);
        for (int n : arr) {
            System.out.print(n+" ");
        }
    }
    //Approach 1: Print elements
    static void negativeSeparate(int[] arr){
        for (int a : arr)
            if (a < 0)
                System.out.print(a + " ");
        for (int a : arr)
            if (a >= 0)
                System.out.print(a + " ");
    }

    //Approach 2: Swap within array
    static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void negativeSort(int[] arr){
        int ind;
        for (int i=0; i<arr.length-1;i++){
            if (arr[i]>0){
                ind=i+1;
                while(ind< arr.length){
                    if (arr[ind]<0) {
                        swap(arr, i, ind);
                        break;
                    }
                    ind++;
                }
            }
        }
    }
}

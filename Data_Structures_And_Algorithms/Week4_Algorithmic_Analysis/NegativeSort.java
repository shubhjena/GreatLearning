package Week4_Algorithmic_Analysis;
/*
An array contains both positive and negative numbers in random order.
Rearrange the array elements so that all negative numbers appear before all positive numbers.
 */

public class NegativeSort {
    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        System.out.println("Approach 1");
        negativeSeparate(arr);
        System.out.println("\nApproach 2");
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
    static void negativeSort(int[] arr)
    {   //Loop 1: Checks each element for positive number
        for (int i=0; i<arr.length-1;i++){
            if (arr[i]>0){
                //Loop 2: Finds the first negative number after element arr[i]
                for(int j=i+1;j< arr.length;j++){
                    if (arr[j]<0) {
                        //Loop 3: Swaps negative number backwards in pairs till i
                        //This maintains the order of the numbers after +ve & -ve are separated
                        for (int k = j; k >i; k--) {
                            swap(arr, k, k - 1);
                        }
                        break; //Break loop 2 once a -ve number is found & swapping is done
                    }
                }
            }
        }
    }
}

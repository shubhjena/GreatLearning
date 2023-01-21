package Week4;
/*
An array contains both positive and negative numbers in random order.
Rearrange the array elements so that all negative numbers appear before all positive numbers.
 */

public class NegativeSort {
    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        negativeSeparate(arr);
    }
    static void negativeSeparate(int[] arr){
        for (int a : arr)
            if (a < 0)
                System.out.print(a + " ");
        for (int a : arr)
            if (a > 0)
                System.out.print(a + " ");
    }
}

package Week4;

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

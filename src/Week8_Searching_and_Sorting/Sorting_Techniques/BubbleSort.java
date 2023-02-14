package Week8_Searching_and_Sorting.Sorting_Techniques;

public class BubbleSort implements Sort{
    @Override
    public int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j]>arr[j+1])
                    swap(arr,j,j+1);
            }
        }
        return arr;
    }

    private static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}

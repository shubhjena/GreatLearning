package Week8_Searching_and_Sorting.Sorting;

public class BubbleSort implements Sort{
    @Override
    public int[] sort(int[] arr,int start,int end) {
        for (int i = start+1; i <= end; i++) {
            for (int j = 0; j <= end-i; j++) {
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

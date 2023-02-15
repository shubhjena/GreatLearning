package Week8_Searching_and_Sorting.Sorting;

public class QuickSort implements Sort {

    @Override
    public int[] sort(int[] arr, int start, int end) {
        if (start<end) {
            int pi = partition(arr,start,end);
            sort(arr,start,pi-1);
            sort(arr,pi+1,end);
        }
        return arr;
    }

    private int partition(int[] arr,int start, int end) {
        int pivot = arr[end],pivotPos = start-1;
        for (int i = start ; i < end; i++){
            if (arr[i]<pivot)
                swap(arr,i,++pivotPos);
        }
        swap(arr,++pivotPos,end);
        return pivotPos;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

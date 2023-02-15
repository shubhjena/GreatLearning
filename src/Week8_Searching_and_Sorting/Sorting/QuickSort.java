package Week8_Searching_and_Sorting.Sorting;

public class QuickSort implements Sort {

    @Override
    public int[] sort(int[] arr, int start, int end) {
        if (start<end) {
            int pi = partition(arr,start,end); //selecting the partition index "pi" and placing it at correct place
            sort(arr,start,pi-1);
            sort(arr,pi+1,end);
        }
        return arr;
    }

    private int partition(int[] arr,int start, int end) {
        int pivot = arr[end],pivotPos = start-1; //select last element as the pivot
        for (int i = start ; i < end; i++){ //loop runs till n-1 as we already have pivot at n
            if (arr[i]<pivot)
                swap(arr,i,++pivotPos); //placing the found number at the end of smaller numbers found till now
        }
        swap(arr,++pivotPos,end); //placing the pivot at its correct index i.e. pivotPos
        return pivotPos;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

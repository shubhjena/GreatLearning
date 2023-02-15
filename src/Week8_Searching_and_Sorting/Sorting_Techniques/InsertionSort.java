package Week8_Searching_and_Sorting.Sorting_Techniques;


public class InsertionSort implements Sort {

    @Override
    public int[] sort(int[] arr,int start, int end) {
        for (int i = start+1; i <=end; i++) {
            int key = arr[i];
            int j = i-1;
            while ( j >=start && arr[j]>key) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}

package Week8_Searching_and_Sorting.Sorting_Techniques;


public class SelectionSort implements Sort{

    public int[] sort(int[] arr,int start, int end) {
        if(arr.length == 0) return arr;
        for (int i = start; i <=end; i++) {
            int curMin = i;
            for (int j = i+1; j <=end; j++) {
                if(arr[curMin]>arr[j])
                    curMin = j;
            }
            swap(arr,i,curMin);
        }
        return arr;
    }
    private static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}

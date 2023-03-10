package Week8_Searching_and_Sorting.Sorting;


public class SelectionSort implements Sort{

    public int[] sort(int[] arr,int start, int end) {
        if(arr.length == 0) return arr;
        for (int i = start; i <=end; i++) { //loop to fix the correct element at i
            int curMin = i;
            for (int j = i+1; j <=end; j++) { //loop to find the min element in the remaining part
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

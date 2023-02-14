package Week8;


public class SelectionSort implements Sort{

    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int curMin = i;
            for (int j = i+1; j < arr.length; j++) {
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

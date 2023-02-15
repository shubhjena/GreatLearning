package Week8_Searching_and_Sorting.Searching;

public class LinearSearch {
    public static int search(int[] arr,int start, int end, int element) {
        for (int i = start; i <= end;i++){
            if (arr[i]==element)
                return i;
        }
        return -1;
    }
}

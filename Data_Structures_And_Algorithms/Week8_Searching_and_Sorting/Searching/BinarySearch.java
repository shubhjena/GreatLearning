package Week8_Searching_and_Sorting.Searching;

public class BinarySearch {
    public static int search(int[] arr,int start, int end, int element) {
        if (start>end) return -1;
        else {
            int mid =start + (end-start)/2;
            if(element == arr[mid])     return mid;
            else if (element> arr[mid]) return search(arr,mid+1,end,element);
            else return search(arr,start,mid-1,element);
        }
    }
    public static int search2(int[] arr,int start, int end, int element) {
        while (start<=end){
            int mid = start + (end-start)/2;
            if (arr[mid] == element) return mid;
            else if (arr[mid] < element) start = mid +1;
            else end = mid-1;
        }
        return -1;
    }
}

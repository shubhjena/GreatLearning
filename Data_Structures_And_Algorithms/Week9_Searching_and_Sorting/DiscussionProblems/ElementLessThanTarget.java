package Week9_Searching_and_Sorting.DiscussionProblems;
//find all the elements less than target

public class ElementLessThanTarget {
    public static void main(String[] args) {

    }

    public static int findElement(int[] arr, int target){
        int start = 1, end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (arr[mid] >= target && arr[mid-1]<target) return mid;
            else if (arr[mid] < target) start = mid +1;
            else end = mid-1;
        }
        return -1;
    }
}

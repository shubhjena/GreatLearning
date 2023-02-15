package Week8_Searching_and_Sorting.Sorting;

public class MergeSort implements  Sort{

    @Override
    public int[] sort(int[] arr, int start, int end) {
        if (start<end) {
            int mid  = start + (end-start)/2;
            sort(arr,start,mid);
            sort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
        return arr;
    }

    private void merge(int[] arr, int start, int mid, int end) {
        int leftPtr=0, rightPtr=0, arrPtr = start;
        int size1 = mid-start+1;
        int size2 = end-mid;
        int[] leftArr = new int[size1], rightArr = new int[size2];
        System.arraycopy(arr, start, leftArr, 0, size1);
        System.arraycopy(arr,mid+1, rightArr,0,size2);
        while (leftPtr<size1 && rightPtr<size2){
            if (leftArr[leftPtr]>rightArr[rightPtr]){
                arr[arrPtr] = rightArr[rightPtr];
                rightPtr++;
            }
            else{
                arr[arrPtr] = leftArr[leftPtr];
                leftPtr++;
            }
            arrPtr++;
        }
        if (leftPtr<size1) System.arraycopy(leftArr,leftPtr,arr,arrPtr,size1-leftPtr);
        if (rightPtr<size2) System.arraycopy(rightArr,rightPtr,arr,arrPtr,size2-rightPtr);
    }
}

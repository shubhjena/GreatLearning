package Week4;

public class SearchPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 2;
        System.out.println(searchPos(arr,target));
    }
    static int searchPos(int[] arr, int target){
        for (int i=0;i<arr.length; i++)
            if (arr[i]>=target)
                return i;
        return -1;
    }
}

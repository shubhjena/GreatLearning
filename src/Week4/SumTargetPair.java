package Week4;
/*
Find all Pairs in an Array of Integers Whose sum is Equal to a Given Number
 */
public class SumTargetPair {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,8,7,9};
        int sum = 8;
        findPair(arr,sum);
     }
     static void findPair(int[] arr, int sum){
        int size = arr.length;
        for (int i = 0; i < size-1; i++)
            for (int j = i+1; j <size; j++)
                if (arr[i]+arr[j]==sum)
                    System.out.printf("[%d, %d] ",arr[i],arr[j]);
     }
}

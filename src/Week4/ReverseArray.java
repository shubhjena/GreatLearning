package Week4;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        for (int a:reverseArray(arr)) {
            System.out.print(a+" ");
        }
    }
    static int[] reverseArray(int[] arr){
        int i=0,j=arr.length-1,temp;
        while (i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
        return arr;
    }
}

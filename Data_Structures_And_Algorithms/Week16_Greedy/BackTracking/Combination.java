package Week16_Greedy.BackTracking;

public class Combination {
    static StringBuilder sb = new StringBuilder(" ");
    public static void combination(char[] arr, int k, int start) {
        if (k==0){
            System.out.println(sb);
            return;
        }
        for (int i = start; i < arr.length-k+1; i++) {
            sb.append(arr[i]);
            combination(arr,k-1,i+1);
            sb.setLength(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        char[] arr = new char[]{'a','b','c','d'};
        combination(arr,3,0);
    }
}

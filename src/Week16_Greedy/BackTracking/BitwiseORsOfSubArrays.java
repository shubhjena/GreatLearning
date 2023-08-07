package Week16_Greedy.BackTracking;

import java.util.HashSet;
import java.util.Stack;

public class BitwiseORsOfSubArrays{
    public int subarrayBitwiseORs(int[] arr) {
        if(arr.length == 1) return 1;
        //loop to set the lenght of sub array
        for(int i=0; i< arr.length; i++){
            for(int j=1; j< arr.length - i; j++){
                combination(arr,j,0);
            }
        }
        return set.size();
    }

    static Stack<Integer> stack = new Stack<Integer>();
    static HashSet<Integer> set = new HashSet<>();
    public static void combination(int[] arr, int k, int start) {
        if (k==0){
            Stack<Integer> temp = new Stack<Integer>();
            int curr=0;
            while(!stack.isEmpty()){
                curr = curr|stack.peek();
                temp.push(stack.pop());
            }
            set.add(curr);
            while(!temp.isEmpty()){
                stack.push(temp.pop());
            }
            return;
        }
        for (int i = start; i < arr.length-k+1; i++) {
            stack.push(arr[i]);
            combination(arr,k-1,i+1);
            stack.pop();
        }
    }
}

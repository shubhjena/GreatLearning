package Week12_Stacks_and_Queues;
//https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1
//Stock span problem
/*
The stock span problem is a financial problem where we have a series of n daily price
quotes for a stock, and we need to calculate the span of stocks price for all n days.
The span Si of the stocks price on a given day 'i' is defined as the maximum number of
consecutive days just before the given day, for which the price of the stock on the
current day is less than or equal to its price on the given day.
For example, if an array of 7 days prices is given as {100, 80, 60, 70, 60, 75, 85},
then the span values for corresponding 7 days are {1, 1, 1, 2, 1, 4, 6}.
 */
import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static int[] stockSpan(int[] price, int n){
        Stack<Integer> stk = new Stack<>();
        stk.push(0);

        int[] res = new int[n];
        res[0] = 1;

        for (int i=1; i<n; i++){
            while(!stk.isEmpty() && price[i] >= price[stk.peek()]){
                stk.pop();
            }
            res[i] = stk.isEmpty()? i+1: i-stk.peek();
            stk.push(i);
        }
      return res;
    }

    public static void main(String[] args) {
        int[] price = new int[]{100, 80, 60, 70, 60, 75, 85};
        System.out.println("Stock span for the given prices is : "+ Arrays.toString(stockSpan(price, price.length)));
    }
}

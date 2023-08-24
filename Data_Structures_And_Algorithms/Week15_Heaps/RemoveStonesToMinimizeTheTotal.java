package Week15_Heaps;
//1962. Remove Stones to Minimize the Total
/*
You are given a 0-indexed integer array piles, where piles[i] represents the number of stones in the ith pile,
and an integer k. You should apply the following operation exactly k times:
Choose any piles[i] and remove floor(piles[i] / 2) stones from it.
Notice that you can apply the operation on the same pile more than once.
Return the minimum possible total number of stones remaining after applying the k operations.
floor(x) is the greatest integer that is smaller than or equal to x (i.e., rounds x down).
 */
import java.util.PriorityQueue;

public class RemoveStonesToMinimizeTheTotal {
    public static int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((x, y) -> (y-x));
        for (int p : piles) {
            queue.add(p);
        }
        while(k>0 && !queue.isEmpty()){
            int maxPile = queue.poll();
            queue.add(maxPile - maxPile/2);
            k--;
        }
        int remStones = 0;
        while(!queue.isEmpty()){
            remStones += queue.poll();
        }
        return remStones;
    }

    public static void main(String[] args) {
       int[] piles = new int[]{6,5,9};
       int k = 2;
        System.out.println("Minimum Remaining stones: "+ minStoneSum(piles,k));
    }
}

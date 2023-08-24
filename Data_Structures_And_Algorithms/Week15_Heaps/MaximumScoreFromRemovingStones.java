package Week15_Heaps;
//1753. Maximum Score From Removing Stones
/*
You are playing a solitaire game with three piles of stones of sizes a, b, and c respectively.
Each turn you choose two different non-empty piles, take one stone from each, and add 1 point to your score.
The game stops when there are fewer than two non-empty piles (meaning there are no more available moves).
Given three integers a, b, and c, return the maximum score you can get.
 */
public class MaximumScoreFromRemovingStones {
    public static int maximumScore(int a, int b, int c) {
        //find the max of the three and sum of other two
        int minSum = a+b+c, max;
        max = Math.max(a, b);
        max = Math.max(max, c);
        minSum = minSum-max;

        //if max is greater than sum of other two return sum of other two
        if(minSum > max)
            return max+ (minSum-max)/2;
            //if max is smaller return the sum of max and half of their difference
        else
            return minSum;
    }

    public static void main(String[] args) {
        int a=6, b=2, c=4;
        System.out.println("Maximum score: "+maximumScore(a,b,c));
    }
}

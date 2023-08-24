package Week16_Greedy;

import java.util.Arrays;
//948. Bag of Tokens
/*
You have an initial power of power, an initial score of 0, and a
bag of tokens where tokens[i] is the value of the ith token (0-indexed).
Your goal is to maximize your total score by potentially playing each token in one of two ways:
If your current power is at least tokens[i], you may play the ith token face up, losing tokens[i] power and gaining 1 score.
If your current score is at least 1, you may play the ith token face down, gaining tokens[i] power and losing 1 score.
Each token may be played at most once and in any order. You do not have to play all the tokens.

Return the largest possible score you can achieve after playing any number of tokens.
 */
public class BagOfTokens {
    public static int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int l = 0, r = tokens.length-1;
        int score = 0;
        while(l<=r){
            if(tokens[l]<=power){
                power-=tokens[l++];
                score++;
            }
            else if (score > 0 && l<r){
                power+=tokens[r--];
                score--;
            }
            else return score;
        }
        return score;
    }

    public static void main(String[] args) {
        int[] tokens = new int[]{100,200,300,400};
        int power = 200;
        System.out.println("Largest possible score is: "+ bagOfTokensScore(tokens,power));
    }
}

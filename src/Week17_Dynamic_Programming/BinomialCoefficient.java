package Week17_Dynamic_Programming;
//Binomial Coefficient
/*
A binomial coefficient C(n, k) also gives the number of ways, disregarding order,
that k objects can be chosen from among n objects more formally, the number of
k-element subsets (or k-combinations) of a n-element set.

The value of C(n, k) can be recursively calculated using the following standard formula for Binomial Coefficients.

   C(n, k) = C(n-1, k-1) + C(n-1, k)
   C(n, 0) = C(n, n) = 1
 */
import java.util.Scanner;

public class BinomialCoefficient {
    static int nCr(int n, int r)
    {
        if(r>n) return 0;
        int[][] dp = new int[n+1][n+1];

        dp[0][0] = 1;
        for (int i = 1; i <=n ; i++) {
            dp[i][0] = 1;
            for (int j = 1; j <=n-1 ; j++) {
                dp[i][j] = dp[i-1][j-1]+dp[i-1][j];
            }
            dp[i][i] = 1;
        }
        return dp[n][r];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of objects: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of objects to be selected: ");
        int r = sc.nextInt();
        System.out.println( n+ "C"+r+" = "+ nCr(n,r));
    }
}

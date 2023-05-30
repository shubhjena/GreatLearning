package Week17_Dynamic_Programming;
//Bell Number
/*
A Bell number, denoted by B(n), is a number that counts the total number of ways to partition a set with n elements. In other words, it represents the number of distinct partitions of a set.

For example, let's consider a set with 3 elements: {A, B, C}. The Bell number B(3) would tell us the total number of distinct ways to partition this set. In this case, there are 5 possible partitions:

{A, B, C}: The entire set as one partition.
{A}, {B, C}: One element in one partition, and the remaining two elements in another.
{B}, {A, C}: Similar to the previous partition but with a different element in the single-element partition.
{C}, {A, B}: Another variation of the single-element partition.
{A}, {B}, {C}: Each element in a separate partition.
Hence, B(3) = 5.

A Better Method is to use Bell Triangle. Below is a sample Bell Triangle for first few Bell Numbers.

1
1 2
2 3 5
5 7 10 15
15 20 27 37 52

// If this is first column of current row 'i'
If j == 0
   // Then copy last entry of previous row
   // Note that i'th row has i entries
   Bell(i, j) = Bell(i-1, i-1)

// If this is not first column of current row
Else
   // Then this element is sum of previous element
   // in current row and the element just above the
   // previous element
   Bell(i, j) = Bell(i-1, j-1) + Bell(i, j-1)
 */
public class BellNumber {
     static int bellNumber(int n){
         int [][] bell = new int[n+1][n+1];
         bell[0][0] = 1;

         for (int i = 1; i <= n; i++) {
             //first element of each row is the las element of the previous row
             bell[i][0] = bell[i-1][i-1];

             for (int j = 1; j <= n; j++) {
                 //each element is equal to the sum of previous element and element above the previous element
                 bell[i][j] = bell[i][j-1] + bell[i-1][j-1];
             }
         }
         return bell[n][0];
     }

    public static void main(String[] args) {
         int n = 6;
        System.out.println("Bell number: "+ n + "is "+ bellNumber(n));
    }
}

//further space can be optimised by using only 1D bell aray keeping only the current row of bell triangle
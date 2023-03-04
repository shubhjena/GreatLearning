package Week6_Arrays;

import java.util.Arrays;

//approach
/*
we can use brute force to fill the matrix from 1 to m*n and perform the row or column operations to this matrix and
then return the desired print value.

Optimised approach:
We store the original row numbers in row[] array and original column numbers in col[] array.
any operations can be done on these two arrays, and print query can be calculated from the original row number and
column number stored in the respective arrays.
The value of element will be n*(row-1)+column;
 */
public class QueryMatrix {
    int m,n;
    int[] row;
    int[] col;
    QueryMatrix(int m, int n){
        this.m = m;
        this.n = n;
        row = new int[m];
        col = new int[n];
        for (int i = 0; i < m; i++) {
            row[i]=i;
        }
        for (int i = 0; i < n; i++) {
            col[i]=i;
        }
    }
    int query(char q, int x, int y){
        x--;y--; //converting to zero index
          if (q=='R'){
               int temp = row[x];
               row [x] = row [y];
               row[y] = temp;
          }
          else if (q=='C'){
               int temp = col[x];
               col [x] = col [y];
               col[y] = temp;
          }
          else if(q=='P')
              return n*row[x]+y+1;
        System.out.println(Arrays.toString(row));
        System.out.println(Arrays.toString(col));
        return -1;
    }
        public static void main(String[] args) {
            QueryMatrix obj = new QueryMatrix(3,3);
            System.out.println(obj.query('R',1,3));
            System.out.println(obj.query('C',2,1));
            System.out.println(obj.query('P',2,2));
        }
}

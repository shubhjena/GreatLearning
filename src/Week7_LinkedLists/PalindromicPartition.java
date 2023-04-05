package Week7_LinkedLists;
/*
Given a string, print all possible palindromic partitions.
Given a string, find all possible palindromic partitions of given string.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Deque;

class PalindromePartition
{
    public static void main( String[] args )
    {
        String str = "nitin";
        all_palindromic_partitions(str);
    }

    private static void all_palindromic_partitions( String str )
    {
        int n = str.length();
        ArrayList<ArrayList<String>> all_part = new ArrayList<>();
        Deque<String> cur_par = new LinkedList<>();

        all_palindromic_partitions_util( all_part, cur_par, 0, n, str);

        for ( int i=0 ; i < all_part.size() ; i++ )
        {
            for( int j = 0 ; j < all_part.get(i).size() ; j++ )
            {
                System.out.print( all_part.get(i).get(j) + "  " );
            }
            System.out.print("\n");
        }

    }

    private static void all_palindromic_partitions_util( ArrayList<ArrayList<String>> all_part ,
                                                         Deque<String> cur_par,
                                                         int start, int n,
                                                         String str)
    {
        if ( start >=n )
        {
            all_part.add( new ArrayList<>(cur_par) );
            return;
        }

        for( int i = start ; i < n ; i++ )
        {
            if( isPalindrome( str, start, i ) )
            {
                cur_par.addLast( str.substring( start, i+1 ));
                all_palindromic_partitions_util( all_part, cur_par, i+1, n, str );
                cur_par.removeLast();
            }
        }

    }

    private static boolean isPalindrome( String str, int start, int i )
    {
        while( start < i )
        {
            if( str.charAt(start++) != str.charAt(i--) )
                return false;
        }
        return true;
    }

}
package Week9_Searching_and_Sorting.DiscussionProblems;

import java.lang.reflect.Array;
import java.util.Arrays;

//825. Friends Of Appropriate Ages
/*
There are n persons on a social media website. You are given an integer array ages where ages[i] is the age of the ith person.

A Person x will not send a friend request to a person y (x != y) if any of the following conditions is true:

age[y] <= 0.5 * age[x] + 7
age[y] > age[x]
age[y] > 100 && age[x] < 100
Otherwise, x will send a friend request to y.

Note that if x sends a request to y, y will not necessarily send a request to x. Also, a person will not send a friend request to themself.

Return the total number of friend requests made.
 */
public class FriendsOfAppropriateAges {
    public static void main(String[] args) {
        int[] ages = {16,17,18};
        System.out.println(numFriendRequests(ages));
    }
    public static int numFriendRequests(int[] ages) {
        Arrays.sort(ages);
        int count=0;
        for (int x = 0; x < ages.length; x++) {
            int start = 0, end = x-1, res = 0;
            while (start<=end){
                int mid = start + (end-start)/2;
                if (checkCondition(ages,x,mid)) {
                    start = mid + 1;
                    res = mid+1;
                }
                else {
                    end = mid - 1;
                }
            }
            if (res!=-1) count+=res;
        }
        return count;
    }
    public static boolean checkCondition(int[] age, int x, int y){
        return (age[x] >= age[y]) && (age[y] > (age[x] * 0.5 +7));
    }
}

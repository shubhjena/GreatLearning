package Week12_Stacks_and_Queues.Practice_Problems;
//933. Number of Recent Calls
/*
You have a RecentCounter class which counts the number of recent requests within a certain time frame.

Implement the RecentCounter class:

RecentCounter() Initializes the counter with zero recent requests.
int ping(int t) Adds a new request at time t, where t represents some time in milliseconds, and returns the number of requests that has happened in the past 3000 milliseconds (including the new request). Specifically, return the number of requests that have happened in the inclusive range [t - 3000, t].
It is guaranteed that every call to ping uses a strictly larger value of t than the previous call.
 */
import java.util.*;

class RecentCounter {
    Queue<Integer> recentRequests = new LinkedList<>();
    int counter;
    public RecentCounter() {
        counter=0;
    }

    public int ping(int t) {
        recentRequests.offer(t);
        while(!recentRequests.isEmpty() && recentRequests.peek()<(t-3000))
            recentRequests.poll();
        return recentRequests.size();
    }

    public static void main(String[] args) {
        RecentCounter obj = new RecentCounter();
        int[] time =  new int[]{ 1,2,3,400,502,608,798,856,1006,3001,3002,4005 };
        for (int t: time) {
            System.out.print(obj.ping(t));
            System.out.print(" ");
        }
    }
}

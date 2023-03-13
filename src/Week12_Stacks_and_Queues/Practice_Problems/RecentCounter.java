package Week12_Stacks_and_Queues.Practice_Problems;
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

package Week12_Stacks_and_Queues.Practice_Problems;
//2073. Time Needed to Buy Tickets
/*
There are n people in a line queuing to buy tickets, where the 0th person is at the front of the line and
the (n - 1)th person is at the back of the line.
You are given a 0-indexed integer array tickets of length n where the number of tickets that the ith person
would like to buy is tickets[i].
Each person takes exactly 1 second to buy a ticket. A person can only buy 1 ticket at a time and has to go
back to the end of the line (which happens instantaneously) in order to buy more tickets. If a person does
not have any tickets left to buy, the person will leave the line.
Return the time taken for the person at position k (0-indexed) to finish buying tickets.
 */

public class TimeNeededToBuyTickets {
    public int timeRequiredToBuy(int[] tickets, int k) {
/*people before k would have bought tickets[k] no of tickets or less and the people after k would have bought
  tickets[k]-1 no of tickets*/
        int threshold = tickets[k]; //no of tickets k wants
        int time=0;

        for (int i=0; i<tickets.length ; i++){
            //people ahead of k will buy threshold or less no of tickets
            if(i<=k) time += Math.min(tickets[i], threshold);

            //people after of k will buy threshold-1 or less no of tickets
            else     time += Math.min(tickets[i], threshold - 1);
        }
        return time;
    }

    public static void main(String[] args) {
        TimeNeededToBuyTickets obj = new TimeNeededToBuyTickets();
        int[] tickets = new int[]{2,3,2};
        int k = 2;
        System.out.println("Time taken for the person at position k to finish buying tickets: ");
        System.out.println(obj.timeRequiredToBuy(tickets,k)+ "s");
    }
}
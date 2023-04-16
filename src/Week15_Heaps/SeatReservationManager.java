package Week15_Heaps;
//1845. Seat Reservation Manager
/*
Design a system that manages the reservation state of n seats that are numbered from 1 to n.
Implement the SeatManager class:
SeatManager(int n) Initializes a SeatManager object that will manage n seats numbered from 1 to n.
All seats are initially available.
int reserve() Fetches the smallest-numbered unreserved seat, reserves it, and returns its number.
void unreserve(int seatNumber) Unreserves the seat with the given seatNumber.
 */

import java.util.PriorityQueue;

public class SeatReservationManager {
    PriorityQueue<Integer> pq;
    public SeatReservationManager(int n) {
        pq = new PriorityQueue<>();
        for(int i=1; i<=n; i++){
            pq.add(i);
        }
    }

    public int reserve() {
        if (pq.isEmpty()) return -1;
        return pq.poll();
    }

    public void unreserve(int seatNumber) {
        pq.add(seatNumber);
    }

    public static void main(String[] args) {
        SeatReservationManager obj = new SeatReservationManager(72);
        System.out.println("New Reservation: "+ obj.reserve());
        obj.unreserve(1);
    }
}

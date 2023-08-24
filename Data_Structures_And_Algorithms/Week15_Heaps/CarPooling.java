package Week15_Heaps;
//1094. Car Pooling
/*
There is a car with capacity empty seats. The vehicle only drives east (i.e., it cannot turn around and drive west).
You are given the integer capacity and an array trips where trips[i] = [numPassengersi, fromi, toi] indicates that
the ith trip has numPassengersi passengers and the locations to pick them up and drop them off are fromi and toi
respectively. The locations are given as the number of kilometers due east from the car's initial location.
Return true if it is possible to pick up and drop off all passengers for all the given trips, or false otherwise.
 */
import java.util.Arrays;
import java.util.PriorityQueue;

public class CarPooling {
    public static boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips, (a,b) -> (a[1]-b[1]));
        //queue to contain passengers, drop location
        PriorityQueue <int[]> dropQ = new PriorityQueue<>((x,y)->(x[1]-y[1]));

        //for each trip
        for (int[] trip: trips) {

            //add the passenger , drop location to queue
            dropQ.add(new int[]{trip[0], trip[2]});

            //people boarding the cab -> reduce capacity
            capacity -=trip[0];

            //did anyone get down before the current pickup location?
            while (dropQ.peek() != null && dropQ.peek()[1] <= trip[1])
                //increase the capacity if anyone got down
                capacity += dropQ.poll()[0];

            //if there are more people to get on than available capacity
            if (capacity < 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] trips = new int[][]{{2,1,5},{3,3,7}};
        int capacity = 4;
        System.out.println("Can the trips be completed ? \n"+carPooling(trips,capacity));
    }
}

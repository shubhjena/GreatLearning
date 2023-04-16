package Week15_Heaps.Practice_Problems;
//973. K Closest Points to Origin
/*
Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k,
return the k closest points to the origin (0, 0).
The distance between two points on the X-Y plane is the Euclidean distance (i.e., √(x1 - x2)2 + (y1 - y2)2).
You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in).
 */
import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
    public static int[][] kClosest(int[][] points, int k) {
        //queue to store the points in a heap based on distance from origin
        PriorityQueue<Integer[]> queue = new PriorityQueue<>(KClosestPointsToOrigin::distance);
        for(int[] point : points){
            queue.add(new Integer[]{point[0], point[1]});
        }

        //res to store k closest points
        int[][] res = new int[k][2];

        //first k points in the priority queue are the required points
        for(int i=0; i<k && !queue.isEmpty() ; i++){
            res[i] = new int[]{queue.peek()[0],queue.poll()[1]};
        }
        return res;
    }
    //returns the difference of distances of two points from origin
    static int distance(Integer[] x,Integer[] y){
        int xd =  (int)(Math.pow(x[0],2) + Math.pow(x[1],2));
        int yd =  (int)(Math.pow(y[0],2) + Math.pow(y[1],2));
        return xd-yd;
    }

    public static void main(String[] args) {
        int[][] points = new int[][]{ {2,10},{-9,-9},{0,8},{-2,-2},{8,9},{-10,-7},{-5,2},{-4,-9}};
        int k = 7;
        int[][] res = kClosest(points,k);
        System.out.println(Arrays.deepToString(res));
    }
}

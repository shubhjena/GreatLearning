package Week15_Heaps;
//1338. Reduce Array Size to The Half
/*
You are given an integer array arr. You can choose a set of integers and remove all the occurrences of these integers in the array.
Return the minimum size of the set so that at least half of the integers of the array are removed.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReduceArraySizeToTheHalf {
    public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int e : arr) {
            map.put(e,map.getOrDefault(e,0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((x,y) -> (y.getValue()-x.getValue()));
        queue.addAll(map.entrySet());
        int count = 0,res = 0;
        while((arr.length - count) > arr.length/2){
            count += queue.poll().getValue();
            res++;
        }
        return res;
    }
}

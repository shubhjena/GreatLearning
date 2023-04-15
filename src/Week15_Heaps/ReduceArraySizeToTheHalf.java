package Week15_Heaps;

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

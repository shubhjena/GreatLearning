package Week15_Heaps;
//1405. Longest Happy String
/*
A string s is called happy if it satisfies the following conditions:

s only contains the letters 'a', 'b', and 'c'.
s does not contain any of "aaa", "bbb", or "ccc" as a substring.
s contains at most a occurrences of the letter 'a'.
s contains at most b occurrences of the letter 'b'.
s contains at most c occurrences of the letter 'c'.
Given three integers a, b, and c, return the longest possible happy string. If there are multiple longest happy strings, return any of them. If there is no such string, return the empty string "".

A substring is a contiguous sequence of characters within a string.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LongestHappyString {
    public static String longestHappyString(int a, int b, int c) {
        HashMap<Character,Integer> map = new HashMap<>();

        if(a>0) map.put('a',a);
        if(b>0) map.put('b',b);
        if(c>0) map.put('c',c);

        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>((x,y) -> (y.getValue() - x.getValue()));
        pq.addAll(map.entrySet());

        StringBuilder sb = new StringBuilder();

        sb.append("xx");

        while(!pq.isEmpty()) {
            Map.Entry<Character, Integer> first = pq.poll();
            int len = sb.length();

            if(sb.charAt(len-1) == first.getKey() && sb.charAt(len-2) == first.getKey()) {
                if(pq.isEmpty()) {
                    break;
                }
                Map.Entry<Character, Integer> second = pq.poll(); // log 3
                sb.append(second.getKey());
                pq.add(Map.entry(first.getKey(), first.getValue()));
                if(second.getValue()-1>=1) {
                    pq.add(Map.entry(second.getKey(), second.getValue()-1));
                }

            } else {
                sb.append(first.getKey());
                if(first.getValue()-1>=1)
                    pq.add(Map.entry(first.getKey(), first.getValue()-1));
            }
        }

        return sb.subSequence(2, sb.length()).toString();
    }

    public static void main(String[] args) {
        int a=5,b=2,c=1;
        System.out.println("Longest happy String: "+ longestHappyString(a,b,c));
    }
}

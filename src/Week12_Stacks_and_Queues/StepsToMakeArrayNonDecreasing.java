package Week12_Stacks_and_Queues;

import java.util.Stack;

public class StepsToMakeArrayNonDecreasing {
    static class Pair<K,V>{
        K key;
        V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
    public static int totalSteps(int[] nums) {
        int n = nums.length;
        int ans = 0;
        Stack<Pair<Integer,Integer>> st = new Stack<>();
        st.push(new Pair<>(nums[n-1],0));


        for(int i=n-2;i>=0;i--)
        {
            int count = 0;
            while(!st.isEmpty() && nums[i] > st.peek().getKey())
            {
                count = Math.max(count+1 , st.peek().getValue() );
                st.pop();
            }
            ans = Math.max(ans , count);
            st.push(new Pair<>(nums[i],count));
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {7,14,4,14,13,2,6,13};
        System.out.println(StepsToMakeArrayNonDecreasing.totalSteps(nums));
    }
}

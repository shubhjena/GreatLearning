package Week18_Graphs;
//Dijkstra Algorithm
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {
    static class Pair implements Comparable<PrimAlgorithm.Pair>{
        int wt;
        int v;
        Pair(int v,int wt){
            this.v = v;
            this.wt = wt;
        }

        @Override
        public int compareTo(PrimAlgorithm.Pair that) {
            return this.wt - that.wt;
        }
    }

    static int spanningTree(int v, ArrayList<ArrayList<ArrayList<Integer>>> graph, int S, int D){
        boolean[] vis =  new boolean[v];
        PriorityQueue<Pair> q = new PriorityQueue<>();

        q.add(new Pair(S,0));
        int[] ans =new int[v];
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[S] = 0;
        while(q.size()!=0){
            Pair curr = q.remove();

            int u = curr.v;
            if(!vis[u]){
                vis[u] = true;

                for (ArrayList<Integer> list : graph.get(u)){
                    int vertex = list.get(0);
                    int wt = list.get(1);
                    if(ans[vertex] > ans[u]+wt){
                        ans[vertex] = ans[u]+wt;
                        q.add(new Pair(vertex, ans[vertex]));
                    }
                }
            }
        }
        return ans[D];
    }
}

package Week18_Graphs;
//Prims algorithm to find minimum spanning tree
import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimAlgorithm {
    static class Pair implements Comparable<Pair>{
        int wt;
        int v;
        Pair(int v,int wt){
            this.v = v;
            this.wt = wt;
        }

        @Override
        public int compareTo(Pair that) {
            return this.wt - that.wt;
        }
    }

    static int spanningTree(int v, ArrayList<ArrayList<ArrayList<Integer>>> graph){
        boolean[] vis =  new boolean[v];
        PriorityQueue<Pair> q = new PriorityQueue<>();

        q.add(new Pair(0,0));
        int ans =0;
        while(q.size()!=0){
            Pair curr = q.remove();

            int u = curr.v;
            if(!vis[u]){
                ans+=curr.wt;
                vis[u] = true;

                for (ArrayList<Integer> list : graph.get(u)){
                    int vertex = list.get(0);
                    int wt = list.get(1);
                    if(!vis[vertex]){
                        q.add(new Pair(vertex,wt));
                    }
                }
            }
        }
        return ans;
    }
}

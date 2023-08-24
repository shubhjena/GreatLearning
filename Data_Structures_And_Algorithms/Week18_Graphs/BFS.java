package Week18_Graphs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * this class contains the code for BFS traversal of Graph
 */
public class BFS {
    public static void bfsTraversal(Vertex root){
        Queue<Vertex> q = new LinkedList<>();
        root.setVisited(true);
        q.add(root);

        while(!q.isEmpty()){
            Vertex currentVertex = q.remove();
            System.out.println("Visited vertex : "+ currentVertex);

            for (Vertex v : currentVertex.getAdjacencyList()){
                if (!v.isVisited()){
                    v.setVisited(true);
                    q.add(v);
                }
            }
        }
    }
}

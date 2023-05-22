package Week18_Graphs;

import java.util.List;

public class DFSTraversal {
    /**
     * If we have a cluster of unconnected graphs
     * @param vertexList
     */
    public void dfsTraversal(List<Vertex> vertexList){
        for (Vertex vertex : vertexList){
            if (!vertex.isVisited()){
                vertex.setVisited(true);
                dfsRec(vertex);
            }
        }
    }
    /**
     * this function traverses graph by DFS using recursion
     * @param root
     */
    public void dfsRec(Vertex root){

        if(root == null){
            return;
        }
        System.out.println("Visited vertex: "+ root);
        for (Vertex neighbour : root.getAdjacencyList() ){
            if (!neighbour.isVisited()){
                neighbour.setVisited(true);
                dfsRec(neighbour);
            }
        }
    }
}

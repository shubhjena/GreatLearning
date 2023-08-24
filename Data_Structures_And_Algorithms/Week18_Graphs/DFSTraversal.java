package Week18_Graphs;

import java.util.List;
import java.util.Stack;

public class DFSTraversal {
    private final Stack<Vertex> stack = new Stack<>();

    /**
     * If we have a cluster of unconnected graphs
     * @param vertexList: list of root vertices of independent clusters of graph
     */
    public void dfsTraversal(List<Vertex> vertexList){
        for (Vertex vertex : vertexList){
            if (!vertex.isVisited()){
                vertex.setVisited(true);
                //choose either the recursive or the stack implementation
                dfsRec(vertex);
//                dfsStack(vertex);
            }
        }
    }
    /**
     * this function traverses graph by DFS using recursion
     * @param root: start node of graph
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

    /**
     * this function traverses graph by DFS using Stack data structure
     * @param root: start node of graph
     */
    public void dfsStack(Vertex root){
        this.stack.push(root);
        root.setVisited(true);

        while(!this.stack.isEmpty()){
            Vertex current = this.stack.pop();
            System.out.println("visited: "+current);

            for (Vertex v: current.getAdjacencyList()){
                if (!v.isVisited()){
                    v.setVisited(true);
                    this.stack.push(v);
                }
            }
        }
    }
}

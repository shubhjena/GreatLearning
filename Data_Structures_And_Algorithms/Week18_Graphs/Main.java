package Week18_Graphs;

public class Main {
    public static void main(String[] args) {
        AdjacencyListGraph graph = new AdjacencyListGraph(4);
        Vertex v1 = new Vertex("A");
        Vertex v2 = new Vertex("B");
        Vertex v3 = new Vertex("C");
        Vertex v4 = new Vertex("D");

        graph.getVertices()[0] = v1;
        graph.getVertices()[1] = v2;
        graph.getVertices()[2] = v3;
        graph.getVertices()[3] = v4;

        graph.addNeighbour(v1,v2);
        graph.addNeighbour(v2,v3);
        graph.addNeighbour(v1,v3);
        graph.addNeighbour(v3,v4);

        graph.printAllEdges();

        BFS.bfsTraversal(v1);
    }
}

package Week18_Graphs;

public class AdjacencyListGraph {
    private Vertex[] vertices;
    private int vertexCount;

    public AdjacencyListGraph(int vertexCount) {
        this.vertexCount = vertexCount;
        vertices = new Vertex[vertexCount];
    }

    public void addNeighbour(Vertex vertex1, Vertex vertex2){
        if(vertex1!=null && vertex2!=null){
            vertex1.addNeighbour(vertex2);
        }
    }

    public void printAllEdges(){
        for (Vertex v: vertices){
            v.showNeighbours();
        }
    }

    public Vertex[] getVertices() {
        return vertices;
    }

    public void setVertices(Vertex[] vertices) {
        this.vertices = vertices;
    }

    public int getVertexCount() {
        return vertexCount;
    }

    public void setVertexCount(int vertexCount) {
        this.vertexCount = vertexCount;
    }
}

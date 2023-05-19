package Week18_Graphs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String name;
    private List<Vertex> adjacencyList;

    public Vertex(String name){
        this.name = name;
        adjacencyList = new ArrayList<>();
    }

    public void addNeighbour(Vertex vertex){
        if (vertex==null) return;
        this.adjacencyList.add(vertex);
    }

    public void removeNeighbour(Vertex vertex){
        if (vertex==null) return;
        this.adjacencyList.remove(vertex);
    }
    /**
     * to show all the neighbours of the given vertex
     */
    public void showNeighbours(){
        for (Vertex v: this.adjacencyList ) {
            System.out.println("Edge between "+ this.name+" and "+v.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "name='" + name + '\'' +
                '}';
    }
}

package Week18_Graphs;

public class DisjointUnionSets {
    int[] rank, parent;
    int n;

    //constructor
    public DisjointUnionSets(int n) {
        parent = new int[n];
        rank = new int[n];
        this.n = n;
        for(int i =0; i<n; i++){
            parent[i] = i;
        }
    }

    int findParent(int x){
        if(parent[x] != x)
            parent[x] = findParent(parent[x]);
        return parent[x];
    }

    void union(int x, int y){
        int xRoot = findParent(x);
        int yRoot = findParent(y);
        if(xRoot == yRoot) return;

        if(rank[xRoot] < rank[yRoot])
            parent[xRoot] = yRoot;
        else if (rank[xRoot] > rank[yRoot])
            parent[yRoot] = xRoot;
        else{
            parent[yRoot] = xRoot;
            rank[xRoot] +=1;
        }
    }
}

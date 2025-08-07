package com.graph;

public class AdjMatrix {
    private int [][] adjacencyMatrix;
    private int V ; // number of vertices or nodes

    public AdjMatrix(int vertices){
        this.V  = vertices;
        adjacencyMatrix = new int [V][V]; // initially it is 0 0
    }
    // adding edges for Undirected Graph
    public void addAnEdge( int u , int v){
        adjacencyMatrix[u][v] = 1;
        adjacencyMatrix[v][u] = 1;
    }
    // printing the graph
    public void printGraph(){
        for(int i=0; i<V; i++){
            System.out.print(i + " --> ");
            for(int j=0; j<V; j++){
                if(adjacencyMatrix[i][j] == 1){
                    System.out.print(j + " ");
                }
            }
            System.out.println(); // move to next line after printing one node's neighbors
        }
    }

    public static void main(String[] args) {
        AdjMatrix graph = new AdjMatrix(5);
        graph.addAnEdge(0, 1);
        graph.addAnEdge(0, 2);
        graph.addAnEdge(1, 2);
        graph.addAnEdge(2, 3);
        graph.addAnEdge(3, 4);
        graph.printGraph();
    }
}

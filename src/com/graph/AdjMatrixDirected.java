package com.graph;

public class AdjMatrixDirected {
    private int V;
    private int [][] adjacencyMatrix;

    public AdjMatrixDirected(int vertices){
        this.V = vertices;
        adjacencyMatrix = new int [V][V];
    }
    // adding edge for directed graph
    public void addEdge(int u, int v){
        adjacencyMatrix[u][v]=1;
    }
    // print  the graph
    public void printGraph(){
       // outer loop: goes through each row i.e., each vertex i
        for(int i =0; i<V; i++){
            System.out.print( i + " -> ");
            for(int j =0; j<V; j++){
                if(adjacencyMatrix[i][j]==1){
                    System.out.print( j + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AdjMatrixDirected graph = new AdjMatrixDirected(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.printGraph();
    }
}

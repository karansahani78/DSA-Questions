package com.graph;

public class WeightedGraph {
    private int V;
    private int [][] adjacencyMatrix;

    public WeightedGraph(int vertices ){
        this.V =vertices;
        adjacencyMatrix = new int [V][V];
    }
    // directed graph
    public void addEdge(int u, int v, int weight){
        adjacencyMatrix[u][v] = weight;
    }
    public void printGraph(){
        for(int i=0; i<V; i++){
            System.out.print( i + " ->");

            for(int j=0; j<V; j++){
                if(adjacencyMatrix[i][j]!=0){
                    System.out.print(" (" + j +", weight=" + adjacencyMatrix[i][j] + ")");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        WeightedGraph graph = new WeightedGraph(5);
        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 2, 5);
        graph.addEdge(1, 2, 3);
        graph.addEdge(1, 3, 1);
        graph.addEdge(2, 3, 4);
        graph.addEdge(3, 4, 2);
        graph.printGraph();
    }
}

package com.graph;

import java.util.LinkedList;
import java.util.Queue;

public class BfsTravel {
    private int V;
    private int [][] adjacencyMatrix;

    public BfsTravel(int V) {
        this.V = V;
        this.adjacencyMatrix = new int[V][V];
    }

    // Adding edge for undirected graph
    public void addEdge(int u, int v) {
        adjacencyMatrix[u][v] = 1;
        adjacencyMatrix[v][u] = 1;
    }

    // Printing the graph
    public void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < V; j++) {
                if (adjacencyMatrix[i][j] == 1) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
    // BFS Traversal
    public void bfs(int start){
        boolean [] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        System.out.print("BFS starting from " + start + ": ");

        while(!q.isEmpty()){
            int currentVertice = q.poll();
            System.out.print(currentVertice + " ");

            for(int i=0; i<V; i++){
                if(adjacencyMatrix[currentVertice][i]==1 && !visited[i]){
                    q.add(i);
                    visited[i]=true;
                }
            }
        }
        System.out.println();

    }

    public static void main(String[] args) {
        BfsTravel graph = new BfsTravel(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printGraph();
        graph.bfs(0);
        graph.bfs(2);

    }
}

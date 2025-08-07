package com.graph;

import java.util.ArrayList;
import java.util.List;

public class UndirectedGraph {
    private int V; // Number of vertices
    private List<List<Integer>> adjacencyList; // Adjacency list representation

    // Constructor
    public UndirectedGraph(int vertices) {
        this.V = vertices;
        adjacencyList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    // Add an edge (undirected)
    public void addAnEdge(int u, int v) {
        adjacencyList.get(u).add(v);
        adjacencyList.get(v).add(u);
    }

    // Print the graph
    public void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print(i + " --> ");
            // you can do it like this also
//            List<Integer> neighbors = adjacencyList.get(i);
//            for(int j=0; j<neighbors.size(); j++)
            for (int node : adjacencyList.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println(); // move to next line after printing one node's neighbors
        }
    }

    public static void main(String[] args) {
        UndirectedGraph graph = new UndirectedGraph(5);
        graph.addAnEdge(0, 1);
        graph.addAnEdge(0, 2);
        graph.addAnEdge(1, 2);
        graph.addAnEdge(2, 3);
        graph.addAnEdge(3, 4);
        graph.printGraph();
    }
}

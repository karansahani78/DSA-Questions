package com.graph;

import java.util.HashMap;
import java.util.Map;

public class Center {
    private int[][] adjMatrix;
    private int V;

    public Center(int V) {
        this.V = V;
        adjMatrix = new int[V][V];
    }

    // safely add edges (undirected)
    private void addEdge(int u, int v) {
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
    }

    // print adjacency list view
    private void print() {
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < V; j++) {
                if (adjMatrix[i][j] == 1) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    // find center from edge list
    public static int center(int[][] edges) {
        Map<Integer, Integer> freq = new HashMap<>();
        int totalEdges = edges.length;

        for (int i = 0; i < totalEdges; i++) {
            int vertex1 = edges[i][0];
            int vertex2 = edges[i][1];

            freq.put(vertex1, freq.getOrDefault(vertex1, 0) + 1);
            freq.put(vertex2, freq.getOrDefault(vertex2, 0) + 1);

            // In a star, one node will have degree == totalEdges
            if (freq.get(vertex1) == totalEdges) return vertex1;
            if (freq.get(vertex2) == totalEdges) return vertex2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] edges = {{1, 2}, {2, 3}, {4, 2}}; // input as edge list
        // find center directly from edges
        System.out.println("Center = " + Center.center(edges)); // Output: 2
        Center center = new Center(5);
        center.addEdge(0, 1);
        center.addEdge(0, 2);
        center.addEdge(0, 3);
        center.addEdge(0, 4);
        center.print();
    }
}

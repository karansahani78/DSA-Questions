package com.graph;

import java.util.ArrayList;
import java.util.List;

public class WGAdjList {
    private int V;
    private List<List<Edge>> adjacencyList; //

    // Inner class to represent an edge
    public static class Edge {
        int to;
        int weight;

        public Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    public WGAdjList(int vertices) {
        this.V = vertices;
        this.adjacencyList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    // Adding weighted edge for directed graph
    public void addEdge(int u, int v, int weight) {
        adjacencyList.get(u).add(new Edge(v, weight));
    }

    // Print the graph using loops
    public void printGraph() {
        System.out.println("Directed Weighted Graph:");
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            List<Edge> edges = adjacencyList.get(i);
            for (int j = 0; j < edges.size(); j++) {
                Edge edge = edges.get(j);
                System.out.print("(" + edge.to + ", weight=" + edge.weight + ") ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        WGAdjList graph = new WGAdjList(5);
        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 2, 5);
        graph.addEdge(1, 3, 7);
        graph.addEdge(2, 3, 2);
        graph.addEdge(3, 4, 1);

        graph.printGraph();
    }
}

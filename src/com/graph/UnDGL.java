package com.graph;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class UnDGL {
    private int V;
    private List<List<Edge>> adj;

    // Inner class to represent an edge with weight
    public static class Edge{
        int to;
        int weight;
        public Edge(int  to, int weight){
            this.to = to;
            this.weight= weight;
        }
    }
    public UnDGL(int V){
        this.V = V;
        this.adj = new ArrayList<>();
        for (int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
    }
    // adding the edges
    public void addEdge(int u, int v, int weight) {
      // for undirected graph
        adj.get(u).add(new Edge(v,weight));
        adj.get(v).add(new Edge(u,weight));
    }
    // printing the graph
    public void printGraph(){
        for(int i=0; i<V; i++){
            System.out.print( i + " ->");
            for(Edge edge : adj.get(i)){
                System.out.print( edge.to + " (" + edge.weight + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        UnDGL graph = new UnDGL(5);
        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 2, 5);
        graph.addEdge(1, 2, 3);
        graph.addEdge(2, 3, 1);
        graph.addEdge(3, 4, 4);
        graph.printGraph();
    }
}

package com.graph;

import java.util.ArrayList;
import java.util.List;

public class DirectedGraph {
    private int V; // number of vertices or nodes
    private List<List<Integer>> adjacencyList;
    public DirectedGraph(int vertices){
        this.V = vertices;
        adjacencyList = new ArrayList<>();
        for(int i=0; i<vertices; i++){
            adjacencyList.add(new ArrayList<>());
        }
    }
    // adding edges
    public void addAnEdge(int u, int v){
        adjacencyList.get(u).add(v);
    }
    // printing the graph
    public void printGraph(){
        // print the adjacency list
        for(int i=0; i<V; i++){
            System.out.print( i + " ->");

            for(int j=0; j<adjacencyList.get(i).size(); j++){
                System.out.print( adjacencyList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DirectedGraph graph = new DirectedGraph(5);
        graph.addAnEdge(0, 1);
        graph.addAnEdge(0, 2);
        graph.addAnEdge(1, 2);
        graph.addAnEdge(2, 3);
        graph.addAnEdge(3, 4);
        graph.printGraph();
    }
}

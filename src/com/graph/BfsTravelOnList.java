package com.graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BfsTravelOnList {
    private int V;
    private ArrayList<ArrayList<Integer>> adjList;

    public BfsTravelOnList(int V) {
        this.V = V;
        adjList = new ArrayList<>();
        for(int i=0; i<V; i++){
            adjList.add(new ArrayList<>());
        }
    }
    // undirected graph
    public void addEdge(int u, int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }
    // print the graph
    public void printGraph(){
        for(int i=0; i<V; i++){
            // print the whole list
            System.out.print( i +" -> ");
            ArrayList<Integer> neighbors = adjList.get(i);
            for(int j=0; j<neighbors.size(); j++){
                System.out.print( neighbors.get(j) + " ");
            }
            System.out.println();
        }
    }
    // performing bfs travel
    public static ArrayList<Integer> bfsTraversal (ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean [] visited = new boolean[adj.size()];
        int start =0;
        q.add(start);
        visited[start]= true;
        while(!q.isEmpty()){
            int currentNode =  q.poll();
            result.add(currentNode);
            ArrayList<Integer> neighbors = adj.get(currentNode);
            for(int i=0; i<neighbors.size(); i++){
                int neighbor = neighbors.get(i);
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    q.offer(neighbor);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        BfsTravelOnList bfs = new BfsTravelOnList(3);
        bfs.addEdge(0, 1);
        bfs.addEdge(0, 2);
        bfs.addEdge(1, 2);
        bfs.printGraph();
        ArrayList<Integer> traversal = bfs.bfsTraversal(bfs.adjList);
        System.out.println(traversal);
    }
}

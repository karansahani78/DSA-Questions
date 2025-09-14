package com.graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BFS {
    private int V;
    private int [][] adj;
    public BFS(int V){
        this.V =V;
        this.adj = new int [V][V];
    }
    // adding edges i.e undirected graph
    public void addEdge(int u, int v){
        adj[u][v]=1;
        adj[v][u]=1;
    }
    // printing the graph
    public void printGraph(){
        for(int i=0; i<V; i++){
            System.out.print( i + " --> ");

            for(int j=0; j<V; j++){
                if(adj[i][j]==1){
                    System.out.print( j + " ");
                }
            }
            System.out.println();
        }
    }

    // BFS travels
    public void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        q.add(start);
        visited.add(start);
        while(!q.isEmpty()){
            int currentVertex = q.poll();
            System.out.print(currentVertex + " ");
            for(int i=0; i<V; i++){
                if(adj[currentVertex][i]==1 && !visited.contains(i)){
                    visited.add(i);
                    q.offer(i);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        BFS bfs = new BFS(3);
        bfs.addEdge(0, 1);
        bfs.addEdge(1, 0);
        bfs.addEdge(0, 2);
        bfs.addEdge(2, 0);
        bfs.printGraph();
        bfs.bfs(0);

    }
}

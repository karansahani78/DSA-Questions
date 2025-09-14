package com.graph;

import java.util.LinkedList;
import java.util.Queue;

public class BfsRecursive {
    private int V;
    private int [][] adjacencyMatrix;
    public BfsRecursive(int V) {
        this.V = V;
        adjacencyMatrix = new int[V][V];

    }
    // undirected graph
    public void addEdge(int u, int v){
        adjacencyMatrix[u][v]=1;
        adjacencyMatrix[v][u]=1;
    }
    // print the graph
    public void print(){
        for(int i=0; i<V; i++){
            System.out.print(  i+ " -> ");
            for(int j=0; j<V; j++){
                if(adjacencyMatrix[i][j]==1){
                    System.out.print( j + " ");
                }
            }
            System.out.println();
        }
    }
    // Recursive bfs travel
    public void bfsTravel(Queue<Integer> q, boolean [] visited){
         if(q.isEmpty()){
             return;
         }
        int currentNode = q.poll();
         for(int i=0; i<V; i++){
             if(adjacencyMatrix[currentNode][i]==1 && !visited[i]){
                 visited[i]=true;
                 q.offer(i);
             }
         }
         // call the recursive method
        bfsTravel(q,visited);

    }
    // helper method for bfs travel
    public void bfs(int start){
        boolean visited[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        visited[start]=true;
        q.add(start);
        // now call the above function
        bfsTravel(q,visited);
        System.out.println();

    }

    public static void main(String[] args) {
        BfsTravel bfsTravel = new BfsTravel(3);
        bfsTravel.addEdge(0, 1);
        bfsTravel.addEdge(0, 2);
        bfsTravel.printGraph();
        bfsTravel.bfs(0);
    }
}

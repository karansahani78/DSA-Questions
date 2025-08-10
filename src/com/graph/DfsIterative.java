package com.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.*;

public class DfsIterative {
    private int V;
    private int [][] adj;

    public DfsIterative(int V){
        this.V = V;
        adj = new int [V][V];
    }

    public void addEdge(int u, int v){
        adj[u][v] = 1;
        adj[v][u] = 1;
    }

    public List<Integer> dfs(int start){
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[V];
        List<Integer> traversalOrder = new ArrayList<>();

        stack.push(start);

        while(!stack.isEmpty()){
            int currentNode = stack.pop();

            if(visited[currentNode]) continue;

            visited[currentNode] = true;
            traversalOrder.add(currentNode);  // collect instead of print

            for(int i = V - 1; i >= 0; i--){
                if(adj[currentNode][i] == 1 && !visited[i]){
                    stack.push(i);
                }
            }
        }
        return traversalOrder;
    }

    public static void main(String[] args){
        DfsIterative graph = new DfsIterative(4);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(2,3);

        List<Integer> dfsOrder = graph.dfs(0);
        System.out.println("DFS order: " + dfsOrder);
    }
}

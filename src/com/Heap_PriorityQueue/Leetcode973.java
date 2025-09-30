package com.Heap_PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class Leetcode973 {
    static class ClosestPoint implements Comparable<ClosestPoint> {
        int index;
        int distance;

        public ClosestPoint(int index, int distance) {
            this.index = index;
            this.distance = distance;
        }

        @Override
        public int compareTo(ClosestPoint that) {
            if (this.distance == that.distance) {
                return this.index - that.index;
            }
            return this.distance - that.distance;
        }
    }

    public int[][] closestKPoints(int[][] points, int k) {
        PriorityQueue<ClosestPoint> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];
            int distance = x * x + y * y;
            pq.offer(new ClosestPoint(i, distance));
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i] = points[pq.poll().index];
        }
        return result;
    }

    public static void main(String[] args) {
        Leetcode973 leetcode973 = new Leetcode973();
        int[][] points = {{1, 3}, {-2, 2}};
        int [][] ans = leetcode973.closestKPoints(points, 1);

        for (int[] point : ans) {
            System.out.println(point[0] + " " + point[1]);
        }
    }
}

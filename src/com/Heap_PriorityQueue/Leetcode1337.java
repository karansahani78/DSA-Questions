package com.Heap_PriorityQueue;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leetcode1337 {
    static class Row implements Comparable<Row> {
        int index;
        int soldiers;
        public Row(int index, int soldiers){
            this.index=index;
            this.soldiers=soldiers;
        }

        @Override
        public int compareTo( Row that) {
            if(this.soldiers==that.soldiers){
                return this.index-that.index;  // if soldiers are same then compare sort by index i.e., smaller index first
            }
            return this.soldiers-that.soldiers; // if soldiers are different then compare by soldiers
        }
    }


    // return the weakest row i.e., row that has minimum number of soldiers in it
    public int[] kWeakestRows(int[][] mat, int k) {
        List<Row>row = new ArrayList<>();
        int [] result = new int[k];
        for(int i=0; i<mat.length; i++){
            int soldiers = 0;
            for(int soldier : mat[i]){
                if(soldier==1){
                    soldiers+=soldier;
                }
            }
            row.add(new Row(i,soldiers));
        }
        // sor the liest
        Collections.sort(row);
        for(int i=0; i<k; i++){
            result[i]=row.get(i).index;
        }


        return result;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,1,0,0,0},
                {1,1,1,1,0},
                {1,0,0,0,0},
                {1,1,0,0,0},
                {1,1,1,1,1}};
        Leetcode1337 leetcode1337 = new Leetcode1337();
        int[] result = leetcode1337.kWeakestRows(mat, 3);
        for(int i:result){
            System.out.print(i+" ");
        }
    }
}

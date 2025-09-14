package com.Revision;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionUsingArrayList {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {2, 3, 7, 8};
        IntersectionUsingArrayList intersectionUsingArrayList = new IntersectionUsingArrayList();
        System.out.println(Arrays.toString(intersectionUsingArrayList.intersect(arr1, arr2)));
    }
    public int [] intersect(int[] arr1, int [] arr2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < arr1.length; i++){
            list.add(arr1[i]);
        }
        ArrayList<Integer>intersection = new ArrayList<>();
        for(int i = 0; i < arr2.length; i++){
            if(list.contains(arr2[i])){
                intersection.add(arr2[i]);
            }

        }
        int [] ans = new int [intersection.size()];
        for(int i = 0; i < intersection.size(); i++){
            ans[i] = intersection.get(i);
        }
        return ans;

    }
}

package com.Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionUsingHashSet {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {1,2,3,8,9};
        IntersectionUsingHashSet intersectionUsingHashSet = new IntersectionUsingHashSet();
        System.out.println(Arrays.toString(intersectionUsingHashSet.intersection(arr1,arr2)));
    }
    public int []intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for(int i = 0; i < nums1.length; i++){
            list1.add(nums1[i]);
        }
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums2.length; i++){
            if(list1.contains(nums2[i])){
                set.add(nums2[i]);
            }
        }
        int [] result = new int[set.size()];
        int index = 0;
        for(int nums :set){
            result[index] = nums;
            index++;
        }
        return result;
    }
}

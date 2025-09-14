package com.Revision;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int [] nums1= new int[10];
        nums1[0]=1;
        nums1[1]=2;
        nums1[2]=3;
        nums1[3]=4;
        nums1[4]=5;
        int [] nums2 = {6,7,8,9,10};
        System.out.println(Arrays.toString(Merge(nums1,nums2)));
    }
    public static int[] Merge(int [] nums1, int[] nums2){
        for(int i=0; i<nums2.length; i++){
            nums1[5+i] = nums2[i];
        }
        return nums1;
    }

}

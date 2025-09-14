package com.Revision;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int [] nums1 ={1,2,3,0,0,0};
        int m =3;
        int[] nums2 = {4,5,6};
        System.out.println(Arrays.toString(Merge(nums1,nums2,m)));
    }
    public static int [] Merge(int [] nums1, int [] nums2,int m) {
        for(int i=0; i<nums2.length; i++){
            nums1[m+i] = nums2[i];

        }
        return nums1;
    }
}

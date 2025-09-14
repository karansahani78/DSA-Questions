package com.Arrays;

public class Mult {
    public static void main(String[] args) {
        int [][] nums1 = {{1,2,3},{4,5,6}};
        int [][] nums2 = {{7,8,9},{10,11,12}};
        int [][] result = new int[nums1.length][nums2[0].length];
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2[0].length; j++){
                for(int k=0; k<nums2.length; k++){
                    result[i][j] += nums1[i][k]*nums2[k][j];
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

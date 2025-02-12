package com.SubArrays;

public class OptimalSolution {
    public static void main(String[] args) {
         int [] nums = {3,-4,5,4,-1,7,-8};
        System.out.println(MaxSum(nums));

    }
    public static int MaxSum(int [] nums){
        int max =nums[0];
        int currentMax =0;
        for(int i=0; i<nums.length; i++){
            currentMax=currentMax+nums[i];
            if(currentMax>max){
                max = currentMax;
            }
            if(currentMax<0){
                currentMax=0;
            }
        }
        return max;
    }
}
//! kadane's algorithm
// initialise two variable int max =nums[0] and int current max=0;
//then itereate throw array and currentMx+=nums[i];
//compare if(currentMax>max){
//    max=currentMax;
//        }
//        again if(currentMax<0){
//    currentMax =0;  it mean when you find big negative value then reset currentmax to 0        }

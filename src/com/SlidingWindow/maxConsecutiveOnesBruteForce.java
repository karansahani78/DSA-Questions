package com.SlidingWindow;

public class maxConsecutiveOnesBruteForce {
    public static void main(String[] args) {
        // brutefo
        int [] nums = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(longestOnes(nums,2));
    }
    public static int longestOnes(int[] nums, int k) {
        /*
        initialize maxLength
        initialize zerocounter
         generating all the subarray
         if nums end will 0 then increase the zerocounter
         if zerocounter <=k
         then find current length = end - start +1;
         if currentLength>maxLength
         currentLength  will be the new maxLength then return it
         */

        int maxLength = 0;
        for(int start =0; start<nums.length; start++){
            int zerocount =0;
            for(int end =start; end<nums.length; end++){
                if(nums[end]==0){
                    zerocount++;
                }
                if(zerocount<=k){
                    int currentLength =end - start+1;
                    if(currentLength>maxLength){
                        maxLength = currentLength;
                    }
                }

            }

        }

        return maxLength;
    }
}

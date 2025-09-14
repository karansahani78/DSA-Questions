package com.SlidingWindow;

import java.util.HashMap;

public class TwoDistinctOptimalSolution {
    public static void main(String[] args) {
        String s = "ninninja";
        System.out.println(lengthOfLongestSubstringBruteForce(s,2));
    }
    public static int lengthOfLongestSubstringBruteForce(String s, int k) {
        int max = 0;
        int start =0;
        HashMap<Character,Integer>distinct = new HashMap<>();
        for(int end =start; end<s.length(); end++){
            char current = s.charAt(end);
           distinct.merge(current,1,Integer::sum);
            while(distinct.size()>k){
                char startChar = s.charAt(start);
                distinct.merge(startChar,-1,Integer::sum);
                if(distinct.get(startChar)==0){
                    distinct.remove(startChar);
                }
                start++;
            }
          max = Math.max(max,end-start+1);
            }

        return max;
    }
}

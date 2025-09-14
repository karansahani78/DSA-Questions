package com.Revision;

import java.util.HashSet;

public class maxFruits {
    public static void main(String[] args) {
        int[] fruits = {1, 2, 1};
        System.out.println(maxFruits(fruits));
    }
    public static int maxFruits(int [] fruits){
        int maxFruitsCount =0;
        for(int start =0; start<fruits.length; start++){
            HashSet<Integer>basket = new HashSet<>();
            int count =0; // countinh how many fruits occured without maintaining uniquesness
            for(int end = start; end<fruits.length; end++ ){
               basket.add(fruits[end]);
               if(basket.size()>2){
                   break; // more than two fruits added
               }
               count++;
               if(count>maxFruitsCount){
                   maxFruitsCount = count;
               }

            }
        }

        return maxFruitsCount;
    }
}

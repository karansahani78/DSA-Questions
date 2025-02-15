package com.Revision;

import java.util.HashMap;

public class MaximumFruitsInBasket {
    public static void main(String[] args) {
        int [] fruits = {1,2,3,4,3,3,3};
        System.out.println(maFruits(fruits));
    }
    public static int maFruits(int[] fruits){
        int maxFruits =0;
        int start =0;
        HashMap<Integer, Integer>basket = new HashMap<>();
        for(int end = start; end<fruits.length; end++){
            basket.merge(fruits[end],1,Integer::sum);
            while(basket.size()>2){
                // basket size greater than 2 then decrease the fruits count
                basket.merge(fruits[start],-1,Integer::sum);
                if(basket.get(fruits[start])==0){
                    // if fruits start become 0 then remove the start from basket
                    basket.remove(fruits[start]);
                }
                // and shrink the window
                start++;

            }
            maxFruits = Math.max(maxFruits,end-start+1);

        }
        return maxFruits;
    }

}

package com.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class FruitsInBasketOptimal {
    public static void main(String[] args) {
        int [] fruits = {1,2,3,2,2};
        System.out.println(totalFruit(fruits));
    }
    public static int totalFruit(int[] fruits) {
     /*   To store unique fruit types in the current window use hashset
 Start of the sliding window
 Maximum number of fruits picked
 Add the current fruit to the HashSet
 If the window has more than 2 types of fruits, shrink the window
// Remove the fruit at the start of the window
 Move the start of the window to the right

 */
        int start =0;
        int maxFruits =0;
        Set<Integer> basket = new HashSet<>();
        for(int end = start; end<fruits.length; end++){
            basket.add(fruits[end]);
            if(basket.size()>2){
                basket.remove(fruits[start]);
                start++;
            }
            int currentWindowLength = end - start+1;
            if(currentWindowLength>maxFruits){
                maxFruits = currentWindowLength;
            }
        }
        return maxFruits;
    }
    }


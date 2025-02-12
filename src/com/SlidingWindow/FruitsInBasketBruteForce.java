package com.SlidingWindow;

import java.util.HashSet;

public class FruitsInBasketBruteForce {
    public static void main(String[] args) {
        int[] fruits = {1, 2, 1};
        System.out.println(totalFruit(fruits));
    }

    public static int totalFruit(int[] fruits) {
        /*
        generating all the sub arrays
        initialize the counter which track consecutive fruits which can collected without maintaining uniqueness
        create a hashset to store only unique fruits
        then check if the hashset size more than 2 then it has more than 2 types of fruits in then break
         add fruts to the hashset and increase the counter
        then check if counter is greater than maxfruits then now counter will be the max fruit
        then return the maxfruits
         */
        int maxFruits = 0;
        for(int start=0; start<fruits.length; start++){
            HashSet<Integer>basket = new HashSet<>();
            int counter =0;
            for(int end =start; end<fruits.length; end++){
                basket.add(fruits[end]);
                if(basket.size()>2){
                    break;
                }
                counter++;
                if(counter>maxFruits){
                    maxFruits = counter;
                }


            }
        }
        return maxFruits;

    }
}
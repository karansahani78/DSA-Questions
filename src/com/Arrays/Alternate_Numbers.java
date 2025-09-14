package com.Arrays;

import java.util.Arrays;

public class Alternate_Numbers {
    public static void main(String[] args) {
        int a [] ={1, 2, -4, -5};
        System.out.println(Arrays.toString(alternateNumbers(a)));
    }
    public static int[] alternateNumbers(int []a){
        // create new array to store the alternate numbers
        int [] result = new int[a.length];
        int positiveIndex =0;
        int negativeIndex =1;
        for(int i=0; i<a.length; i++){
            // if negative number
            if(a[i]<0){
                result[negativeIndex]= a[i];
                negativeIndex+=2; // then increase position of negative number by 2 because next negative number found at 3
            } else{
                result[positiveIndex]= a[i];
                positiveIndex+=2;
            }
        }
        return result;
    }
}

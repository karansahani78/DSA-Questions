package com.Revision;

import java.util.Arrays;

public class CopyTwoArr {
    public static void main(String[] args) {
        int []num1 ={1,3,4,5,6,7};
        int [] num2 ={8,9,10,11,12};
        // task copy this two array in new array
        System.out.println(Arrays.toString(Copy(num1,num2)));

    }
    public static int [] Copy(int[] num1, int [] num2){
        int [] newArr = new int[num1.length+num2.length];
        for(int i=0; i<num1.length; i++){
            // copy num1 to newArr
            newArr[i] = num1[i];
        }
        for(int i=0; i<num2.length; i++){
            // copying num2 to newArr and take care that num2 element come after num1 element that's wjy num1.lenght+i
            newArr[num1.length+i] = num2[i];
        }
        return newArr;
    }

}

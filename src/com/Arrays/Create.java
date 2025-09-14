package com.Arrays;

import java.util.Arrays;

public class Create {
    public static void main(String[] args) {
        // syntax
        // datatype[] variable_name = new datatype[size];
        int [] studentRoll = new int[5];
        // now adding role number in studentRoll array
        studentRoll[0]=10;
        studentRoll[1]=11;
        studentRoll[2]=12;
        studentRoll[3]=13;
        studentRoll[4]=13;
        System.out.println(studentRoll[4]);
        studentRoll[0]=9;
        // priting using toString
        System.out.println(Arrays.toString(studentRoll));
    }
}

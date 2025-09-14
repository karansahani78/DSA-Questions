package com.LinkedList.SingularLinkedList;

import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {
        int n =19;
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n){
        HashSet<Integer> seen = new HashSet<>();
        while(n!=1){
            if(seen.contains(n)){
                return false; // cycle detected or already present
            }
            seen.add(n);
            // now our task is to update the n to the new sum as per the question then return the sum
            int sum=0;
            int temp =n;
            while(temp>0){
                int lastDigit = temp%10;
                sum = sum + lastDigit*lastDigit;
                temp = temp/10;
            }
            // update the n to the new sum
            n = sum;
        }
        return true;
    }
}

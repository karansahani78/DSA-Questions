package com.String;

public class Reverse {
    public static void main(String[] args) {
        String s = "Karan"; // it is not a palindrom
        System.out.println(reverse(s));
    }
    public static String reverse(String s){
        char [] arr = s.toCharArray();
        int left =0;
        int right = arr.length-1;;
        while(left <right){
            char temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}

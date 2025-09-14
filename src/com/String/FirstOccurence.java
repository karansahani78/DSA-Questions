package com.String;

public class FirstOccurence {
    public static void main(String[] args) {
        String s = "swiss";
        System.out.println(findFirstOccurence(s));

    }
    public static char findFirstOccurence(String s){
        int [] freq = new int[256];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch]++; // now incresing the character in freq arr
        }
        for(int i=0; i<s.length();i++){
            if(freq[s.charAt(i)]==1){
                return s.charAt(i);
            }
        }
        return '.';
    }
}

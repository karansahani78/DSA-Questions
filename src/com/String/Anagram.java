package com.String;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "silent";
        System.out.println(isAnagram(str1,str2));
    }
    public static boolean isAnagram(String str1, String str2) {
        if(str2.length()!=str1.length()) return false;
        int [] count = new int[256];
        for(int i=0; i<str1.length(); i++){
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for(int i=0; i<256; i++){
            if(count[i]!=0) return false;
        }
        return true;
    }
    
}

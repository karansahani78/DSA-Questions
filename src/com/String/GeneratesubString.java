package com.String;

public class GeneratesubString {
    public static void main(String[] args) {
        String str  ="abc";
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                String subString = "";
                for(int k=i; k<j; k++){
                    subString += str.charAt(k);

                }
                System.out.print(subString+" ");
            }
        }
//        // substring without k
//        for(int i=0; i<str.length(); i++){
//            for(int j=i+1; j<=str.length(); j++){
//                System.out.println(str.substring(i,j));
//            }
//        }
    }
}

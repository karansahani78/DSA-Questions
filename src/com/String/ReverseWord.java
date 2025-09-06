package com.String;

public class ReverseWord {
    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";
        System.out.println(revereWord(s));

    }
    public static String revereWord(String s){
        String [] parts = s.split("\\.");
        StringBuilder word = new StringBuilder();
        boolean first=true;
        for(int i=parts.length-1;i>=0;i--){
            if(parts[i].isEmpty()) continue;;
            if(!first) word.append('.');
            word.append(parts[i]);
            first=false;

        }
        return word.toString();
    }
}

package com.String;

import java.util.Arrays;

public class CConsVow {
    public static void main(String[] args) {
        String str = "Word";
        int [] result = countCV(str);
        System.out.println(Arrays.toString(result));
    }

    public static int[] countCV(String str) {
        int cCount = 0;
        int vCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vCount++;
            } else if (Character.isLetter(ch)) {
                cCount++;
            }
        }

        return new int[]{vCount, cCount}; // return both in array
    }
}

package com.Revision;

import java.util.Arrays;
//! Wrong approach

public class union {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 6};
        int[] b = {2, 3, 5};
        System.out.println(Arrays.toString(merged(a, b)));

    }

    public static int[] merged(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }
        for (int i = 0; i < c.length; i++) {
            int start = c[0];
            int end = c[c.length - 1];
            while (start < end) {
                if (c[start] == c[end]) {
                    c[i] = c[start];
                } else if (c[start] != c[end]) {
                    break;
                }
                start++;
                end--;
            }

        }
        return c;
    }
}
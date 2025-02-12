package com.ArrayList;

import java.util.ArrayList;

public class Syntax {
    public static void main(String[] args) {
        // Syntax
        ArrayList<Integer> list = new ArrayList<Integer>();
        // to add element
        // if you want to add element at specific index
        list.add(0, 12);
        list.add(1, 10);
        list.add(13);
        list.add(14);
        list.add(15);
        // and to add element
        list.add(2);
        // to update element
        list.set(0, 99);
        // to remove element
        list.remove(1);
        // to get specific value
        list.get(2);
        // ! we use this comment for warning
        System.out.println(list);
        System.out.println(list.get(2));
    }
}

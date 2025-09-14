package com.Stream;

import java.util.Arrays;
import java.util.List;

public class Intersection {
    public static void main(String[] args) {
        List<Integer>list1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> list2 = Arrays.asList(4,5,6,7,8,9);
        // find the intersection using stream
        List<Integer> intersection = list1.stream().filter(list2::contains).toList();
        System.out.println(intersection);

    }

}

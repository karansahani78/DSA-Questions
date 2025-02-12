package com.TreeSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        // Adding elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); // Duplicate, will not be added
        set.add(5);
        set.add(25);

        // Print elements
        System.out.println("TreeSet: " + set); // Output: [5, 10, 20, 25, 30]

        // Accessing first and last elements
        System.out.println("First: " + set.first()); // Output: 5
        System.out.println("Last: " + set.last());   // Output: 30

        // Accessing higher and lower values
        System.out.println("Higher(15): " + set.higher(15)); // Output: 20
        System.out.println("Lower(25): " + set.lower(25));   // Output: 20

        // Accessing ceiling (smallest >= given element) and floor (largest <= given element)
        System.out.println("Ceiling(15): " + set.ceiling(15)); // Output: 20
        System.out.println("Floor(25): " + set.floor(25));     // Output: 25

        // Removing elements
        System.out.println("Removing 20...");
        set.remove(20); // Removes element 20
        System.out.println("TreeSet after removal: " + set); // Output: [5, 10, 25, 30]

        // Iterators
        System.out.print("Iterating in ascending order: ");
        Iterator<Integer> ascIterator = set.iterator();
        while (ascIterator.hasNext()) {
            System.out.print(ascIterator.next() + " ");
        }
        System.out.println(); // Output: 5 10 25 30

        System.out.print("Iterating in descending order: ");
        Iterator<Integer> descIterator = set.descendingIterator();
        while (descIterator.hasNext()) {
            System.out.print(descIterator.next() + " ");
        }
        System.out.println(); // Output: 30 25 10 5

        // Subset operations
        System.out.println("SubSet(5, 25): " + set.subSet(5, 25)); // Output: [5, 10]
        System.out.println("HeadSet(25): " + set.headSet(25));     // Output: [5, 10]
        System.out.println("TailSet(10): " + set.tailSet(10));     // Output: [10, 25, 30]

        // Check element existence
        System.out.println("Contains 10? " + set.contains(10)); // Output: true
        System.out.println("Contains 20? " + set.contains(20)); // Output: false

        // Size and isEmpty
        System.out.println("Size of TreeSet: " + set.size()); // Output: 4
        System.out.println("Is TreeSet empty? " + set.isEmpty()); // Output: false

        // Clear the TreeSet
        set.clear();
        System.out.println("TreeSet after clear(): " + set); // Output: []
        System.out.println("Is TreeSet empty now? " + set.isEmpty()); // Output: true
    }
}

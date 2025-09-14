package com.HashMap;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        /*
        1.store as key value pair
        2. key is unique
        3. values can be same
        4. do not allow duplicate key
        5.do not maintain order it is unsorted
        6. Time complexity O(alpha) or you can say constant time
         */

        HashMap<Integer,String>school = new HashMap<>();
        // TO insert value
        school.put(1,"karan");
        school.put(2,"sohan");
        school.put(3,"hariya");
        school.put(4,"bixxa");
        System.out.println(school);
        // To get value
        System.out.println(school.get(1));
        System.out.println(school.get(5)); // return null
        // To update value
        school.put(1,"saurav");
        System.out.println(school);
        // To replace
        school.replace(1,"ramesh");
        System.out.println(school);
        // To iterate over HashMap and print value
        for(Map.Entry<Integer,String>entry:school.entrySet()){
            System.out.println("Key ->"+entry.getKey());
            System.out.println("Value ->"+ entry.getValue());
        }
        // Next method to iterate
        for(Integer key:school.keySet()){
            System.out.println("Keys ->"+key);
            System.out.println("Value ->"+school.get(key));
        }
    }
}

package com.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<Integer>(5);
        // for input
        for(int i=0; i<5; i++){
            list.add(in.nextInt());

        }
        // for output
        for(int i=0; i<5; i++){
            System.out.print(list.get(i));
        }

    }
}

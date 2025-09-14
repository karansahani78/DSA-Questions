package com.karan;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int salary = 200000;
        if(salary>200000){
            salary = salary-5000;
        } else if(salary==2000000){
            salary=salary+3000;
        } else{
            salary=salary+1200;
        }
        System.out.println(salary);
    }
}
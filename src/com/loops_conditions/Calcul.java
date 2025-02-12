package com.loops_conditions;

import java.util.Scanner;

public class Calcul {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans =0;
        while(true){
            // taking operators as input
            System.out.println("Enter the operator");
            char operator = in.next().charAt(0);
            if(operator=='x' || operator =='X'){
                System.out.println("Invalid operator!!");
                break;
            }
            if(operator=='+' || operator=='-' || operator=='*' || operator=='/' || operator=='%'){
                // taking two numbers as input
                System.out.println("Enter the two numbers");
                int num1= in.nextInt();
                int num2 =in.nextInt();
                if(operator=='+'){
                    ans = num1+num2;
                }
                if(operator=='-'){
                    ans = num1-num2;
                }
                if(operator=='*'){
                    ans = num1*num2;
                }
                if(operator=='/'){
                    if(num2!=0){
                        ans = num1/num2;
                    } else{
                        System.out.println("Number can not divide by zero");
                        continue;
                    }
                }
                if(operator=='%'){
                    if(num2!=0){
                        ans = num1%num2;
                    } else {
                        System.out.println("Modulo by zero is not allowed");
                        continue;
                    }
                }
                System.out.println(ans);
            }

        }
    }
}

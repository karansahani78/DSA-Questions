package com.Switch;

import java.util.Scanner;

public class SwitchCasWithout_break {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Suscription(Normal,Advance,Premium):");
        String tier =in.nextLine().trim().toLowerCase();
        switch (tier){
            case "normal"-> System.out.println("You have chosen Normal Tier.\nFeatures limited resources");
            case "advance"-> System.out.println("You have chosen Advance Tier.\nFeatures No limitation");
            case "premium"-> System.out.println("You have chosen Premium Tier.\nFeatures No limitation and Faster");
            default -> System.out.println("Invalide Tier.\nPlease enter valid Tier");
        }
        in.close();
    }
}

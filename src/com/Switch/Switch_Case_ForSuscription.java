package com.Switch;

import java.util.Scanner;

public class Switch_Case_ForSuscription {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Subscription Tier (Normal, Advance, Premium):");
        String tier = in.nextLine().trim().toLowerCase();
        switch (tier){
            case "normal":
                System.out.println("You have chosen the Normal Tier.\nFeatures: Basic access to content, limited support.");
                break;
            case "advance":
                System.out.println("You have chosen the Advance Tier.\nFeatures:Access to additional content, priority support");
                break;
            case "premium":
                System.out.println("You have chosen the Premium Tier.\nFeatures:All content access, premium support, and exclusive perks.");
                break;
            default:
            System.out.println("Invalid subscription tier. \nPlease choose from Normal, Advance, or Premium.");
        }
    }
}

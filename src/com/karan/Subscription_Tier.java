package com.karan;

import java.util.Scanner;

public class Subscription_Tier {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the tier (Normal, Advance, Premium):");
        String tier = in.nextLine().trim().toLowerCase();

        if (tier.equals("normal")) {
            System.out.println("You have chosen the Normal Tier.\nFeatures: Normal and daily limit.");
        } else if (tier.equals("advance")) {
            System.out.println("You have chosen the Advance Tier.\nFeatures: No limitation and more perks.");
        } else if (tier.equals("premium")) {
            System.out.println("You have chosen the Premium Tier.\nFeatures: No limitation, more bonus perks, and faster service.");
        } else {
            System.out.println("Please enter a valid Subscription Tier.");
        }

        in.close();
    }
}

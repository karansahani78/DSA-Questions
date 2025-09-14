package com.Leetcode121;

public class best_Time {
    public static void main(String[] args) {
        int[] price = {7, 1, 5, 3, 6, 4};
        System.out.println("Best day to sell: Day " + (max(price) + 1)); // Expected output: Day 5
    }

    public static int max(int[] price) {
        int min = price[0]; // Start with the first day's price
        int minIndex = 0;   // Start with the first day's index

        // Find the minimum price and its day
        for (int i = 1; i < price.length; i++) {
            if (price[i] < min) {
                min = price[i];
                minIndex = i;
            }
        }

        int max = price[minIndex]; // Start tracking max from the day of min price
        int maxIndex = minIndex;

        // Find the maximum price after the minimum price
        for (int j = minIndex; j < price.length; j++) {
            if (price[j] > max) {
                max = price[j];
                maxIndex = j;
            }
        }

        return maxIndex; // Return the day to sell (index of max price)
    }
}

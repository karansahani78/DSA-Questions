package com.SlidingWindow;

public class MaxPoint {
    public static void main(String[] args) {
        int[] cardPoints = {1, 2, 3, 4, 5, 6, 1};
        System.out.println(maxScore(cardPoints, 3));  // Expected output: 12
    }

    public static int maxScore(int[] cardPoints, int k) {
        int max = Integer.MIN_VALUE;
        int currentSum = 0;

        // Calculate the initial sum of the first k cards from the front
        for (int i = 0; i < k; i++) {
            currentSum += cardPoints[i];
        }
        max = currentSum;

        // Slide the window by taking cards from the back instead of the front
        for (int i = 0; i < k; i++) {
            currentSum = currentSum - cardPoints[k - 1 - i] + cardPoints[cardPoints.length - 1 - i];
            if (currentSum > max) {
                max = currentSum;
            }
        }

        return max;
    }
}

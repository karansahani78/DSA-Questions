import java.util.HashMap;

public class FruitsInBasketOptimal {
    public static void main(String[] args) {
        int[] fruits = {1, 2, 3, 2, 2};
        System.out.println(totalFruit(fruits));  // Output: 4
    }

    public static int totalFruit(int[] fruits) {
        int start = 0, maxFruits = 0;
        HashMap<Integer, Integer> basket = new HashMap<>();

        // Sliding Window Technique
        for (int end = 0; end < fruits.length; end++) {
            // Add the current fruit to the basket (Increase count)
            basket.merge(fruits[end], 1, Integer::sum);

            // If we have more than 2 types of fruits, shrink the window
            while (basket.size() > 2) {
                basket.merge(fruits[start], -1, Integer::sum); // Decrease count of leftmost fruit
                if (basket.get(fruits[start]) == 0) {
                    basket.remove(fruits[start]); // Remove if count becomes 0
                }
                start++; // Move left pointer forward
            }

            // Update the max length of the valid window
            maxFruits = Math.max(maxFruits, end - start + 1);
        }
        return maxFruits;
    }
}

package dp.memoisation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HowSum {

    private static Map<Integer, List<Integer>> memo = new HashMap<>();

    private static List<Integer> coinChange(int[] coins, int amount) {

        // Check if the result is already calculated and stored in memo
        if (memo.containsKey(amount)) {
            return memo.get(amount);
        }

        // Base cases
        if (amount == 0) {
            return new ArrayList<>(); // No coins needed to make 0 amount
        } else if (amount < 0) {
            return null; // Cannot make negative amount
        }

        int minCoins = Integer.MAX_VALUE;
        for (int coin : coins) {
            int remainingAmount = amount - coin;
            // Recursive call to find minimum coins for remaining amount
            List<Integer> result = coinChange(coins, remainingAmount);
            // Update minimum if a valid solution is found
            // if (result != -1) {
            // minCoins = Math.min(minCoins, result + 1);
            // }
            if (result != null)
                if (!result.isEmpty()) {
                    result.add(coin);
                    memo.put(amount, result);

                    return result;
                }
        }

        // Store the result in memo for future use
        // memo.put(amount, result);

        return null;
    }

    public static void main(String[] args) {
        int[] coins = { 1, 2, 5 };
        int amount = 11;
        List<Integer> minCoins = coinChange(coins, amount);
        System.out.println("Combination of coins: " + minCoins);
    }
}

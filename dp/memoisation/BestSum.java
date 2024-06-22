package dp.memoisation;

import java.util.HashMap;
import java.util.Map;

public class BestSum {

    public static int coinChange(int[] coins, int amount) {
        if (amount == 0)
            return 0; // No coins needed to make 0 amount
        if (amount < 0)
            return -1; // Cannot make negative amount

        // Memoization map to store minimum coins needed for amounts
        Map<Integer, Integer> memo = new HashMap<>();

        return coinChangeHelper(coins, amount, memo);
    }

    private static int coinChangeHelper(int[] coins, int amount, Map<Integer, Integer> memo) {
        // Check if the result is already calculated and stored in memo
        if (memo.containsKey(amount)) {
            return memo.get(amount);
        }

        // Base cases
        if (amount == 0) {
            return 0; // No coins needed to make 0 amount
        } else if (amount < 0) {
            return -1; // Cannot make negative amount
        }

        int minCoins = Integer.MAX_VALUE;
        for (int coin : coins) {
            int remainingAmount = amount - coin;
            // Recursive call to find minimum coins for remaining amount
            int result = coinChangeHelper(coins, remainingAmount, memo);
            // Update minimum if a valid solution is found
            if (result != -1) {
                minCoins = Math.min(minCoins, result + 1);
            }
        }

        // Store the result in memo for future use
        memo.put(amount, minCoins == Integer.MAX_VALUE ? -1 : minCoins);

        return memo.get(amount);
    }

    public static void main(String[] args) {
        int[] coins = { 1, 2, 5 };
        int amount = 11;
        int minCoins = coinChange(coins, amount);
        System.out.println("Minimum number of coins: " + minCoins);
    }
}

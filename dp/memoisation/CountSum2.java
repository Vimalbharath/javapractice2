package dp.memoisation;

import java.util.HashMap;
import java.util.Map;

public class CountSum2 {

    public static void main(String[] args) {
        int[] coins = { 1, 2 };
        int amount = 5;
        int combinations = change(amount, coins);
        System.out.println("Number of combinations: " + combinations);
    }

    private static Map<Integer, Integer> memo = new HashMap<>();

    public static int change(int targetAmount, int[] denominations) {
        // Check if the result is already calculated and stored in memo
        if (memo.containsKey(targetAmount)) {
            return memo.get(targetAmount);
        }

        // Base cases
        if (targetAmount == 0) {
            return 1; // 1 way to reach 0 (using no coins)
        } else if (targetAmount < 0) {
            return 0; // No way to reach a negative amount
        }

        // Initialize combinations for this amount to 0
        int combinations = 0;
        for (int denomination : denominations) {
            int remainingAmount = targetAmount - denomination;

            int ways = change(remainingAmount, denominations);
            if (ways != 0)
                combinations += ways;

        }

        // Store the result in memo for future use
        memo.put(targetAmount, combinations);

        return combinations;
    }
}

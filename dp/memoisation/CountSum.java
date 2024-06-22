package dp.memoisation;

import java.util.HashMap;
import java.util.Map;

public class CountSum {

    public static void main(String[] args) {
        int[] coins = { 1 };
        int ans = change(3, coins);
        System.out.println(ans);
    }

    private static Map<Integer, Integer> memo = new HashMap<>();

    public static int change(int amount, int[] coins) {
        if (amount == 0) {
            return 1;
        } else if (amount < 0) {

            return 0;
        }
        int combinations = 0;
        for (int denomination : coins) {
            int remainingAmount = amount - denomination;
            // Recursively calculate combinations for the remaining amount
            combinations += change(remainingAmount, coins);
        }
        return combinations;
    }
}

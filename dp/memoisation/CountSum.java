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
    static int count = 0;

    public static int change(int amount, int[] coins) {
        if (amount == 0) {
            return 1;
        }
        if (amount < 0) {
            return 0;
        }
        for (int value : coins) {
            int remainder = amount - value;
            change(remainder, coins);
            // if (amount == 0) {
            // count = count + 1;
            // }
        }
        return count;
    }
}

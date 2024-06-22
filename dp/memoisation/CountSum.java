package dp.memoisation;

import java.util.HashMap;
import java.util.Map;

public class CountSum {

    public static void main(String[] args) {
        int[] coins = { 2, 5 };
        boolean ans = change(5, coins);
        System.out.println(ans);
    }

    private static Map<Integer, Integer> memo = new HashMap<>();

    public static boolean change(int amount, int[] coins) {
        if (amount == 0) {
            return true;
        }
        if (amount < 0) {
            return false;
        }
        for (int value : coins) {
            int remainder = amount - value;
            change(remainder, coins);
            if (change(remainder, coins) == true) {
                return true;
            }
        }
        return false;
    }
}

package dp.tabulation;

import java.util.ArrayList;
import java.util.List;

public class HowSum {

    public static void main(String[] args) {
        int[] coins = { 5 };
        int ans = coinChange(coins, 11);
        System.out.println(ans);

    }

    public static int coinChange(int[] coins, int amount) {
        List<List<Integer>> table = new ArrayList<>(amount + 1);
        for (List<Integer> single : table) {
            single = null;
        }
        table.set(0, new ArrayList<>());
        for (int i = 0; i < table.size(); i++) {
            if (table.get(i) != null) {
                for (int b : coins) {
                    if (i + b < table.size())
                    // table[i + b] = true;
                    {
                        table.set(i, new ArrayList<>());
                    }
                }

            }
        }
        return table.get(amount).size();

    }
}

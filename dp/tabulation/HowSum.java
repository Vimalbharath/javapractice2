package dp.tabulation;

import java.util.ArrayList;
import java.util.List;

public class HowSum {

    public static void main(String[] args) {
        int[] coins = { 2, 3, 5 };
        List<List<Integer>> ans = coinChange(coins, 8);
        System.out.println(ans);
        List<List<Integer>> table = new ArrayList<>(11 + 1);
        for (int i = 0; i < 11 + 1; i++) {
            table.add(null);
        }
        System.out.println(table);

    }

    public static List<List<Integer>> coinChange(int[] coins, int amount) {
        List<List<Integer>> table = new ArrayList<>(amount + 1);
        for (int i = 0; i < amount + 1; i++) {
            table.add(null);
        }
        table.set(0, new ArrayList<>());
        for (int i = 0; i < table.size(); i++) {
            if (table.get(i) != null) {
                for (int b : coins) {
                    if (i + b < table.size())
                    // table[i + b] = true;
                    {
                        if (table.get(i + b) == null)
                            table.set(i + b, new ArrayList<>());
                        List<Integer> current = table.get(i + b);
                        current.addAll(table.get(i));
                        current.add(b);

                    }
                }

            }
        }
        return table;

    }
}

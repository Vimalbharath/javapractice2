package dp.tabulation;

import java.util.ArrayList;
import java.util.List;

public class HowSum {

    public static void main(String[] args) {
        int[] coins = { 1, 5, 25 };
        List<List<Integer>> ans = coinChange(coins, 100);
        System.out.println(ans);
        // List<List<Integer>> table = new ArrayList<>(11 + 1);
        // for (int i = 0; i < 11 + 1; i++) {
        // table.add(null);
        // }
        // System.out.println(table);

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
                        // if(table.get(i+b).size()>)

                        List<Integer> current = table.get(i + b);

                        List<Integer> fresh = new ArrayList<>();
                        fresh.add(b);
                        fresh.addAll(table.get(i));
                        // int sum = 0;
                        // for (int value : fresh) {
                        // sum = sum + value;
                        // }
                        // if (sum == i)
                        // table.set(i + b, fresh);

                        // System.out.println(sum);

                        if (current.isEmpty() || current.size() > fresh.size()) {

                            table.set(i + b, fresh);
                            // int sum = 0;
                            // for (int value : current) {
                            // sum = sum + value;
                            // if (sum == i)
                            // return table;
                            // }

                        }

                    }
                }

            }
        }
        return table;

    }
}

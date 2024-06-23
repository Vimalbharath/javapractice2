package dp.tabulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HowSum2 {

    public static void main(String[] args) {
        int[] coins = { 2, 3, 5 };
        List<List<Integer>> ans = coinChange(coins, 8);
        System.out.println(ans);
        // List<List<Integer>> table = new ArrayList<>(11 + 1);
        // for (int i = 0; i < 11 + 1; i++) {
        // table.add(null);
        // }
        // System.out.println(table);

    }

    public static List<List<Integer>> coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return Collections.singletonList(Collections.emptyList()); // One combination for 0 amount (using no coins)
        }
        if (amount < 0) {
            return Collections.emptyList(); // No combinations for negative amount
        }

        List<List<Integer>> table = new ArrayList<>(amount + 1);
        for (int i = 0; i < amount + 1; i++) {
            table.add(null);
        }
        table.set(0, Collections.singletonList(Collections.emptyList())); // Base case: one combination for 0 amount

        for (int i = 0; i < table.size(); i++) {
            if (table.get(i) != null) {
                for (int coin : coins) {
                    int newAmount = i + coin;
                    if (newAmount <= amount && table.get(newAmount) == null) {
                        List<List<Integer>> existingCombos = table.get(i);
                        List<List<Integer>> newCombos = new ArrayList<>();
                        for (List<Integer> combo : existingCombos) {
                            List<Integer> newCombo = new ArrayList<>(combo);
                            newCombo.add(coin);
                            newCombos.add(newCombo);
                        }
                        table.set(newAmount, newCombos);
                    }
                }
            }
        }

        return table.get(amount) == null ? Collections.emptyList() : table.get(amount);
    }

}

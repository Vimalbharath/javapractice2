package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoudRich {

    List<Integer> lis[];
    int n;
    int dp[];

    public int[] loudAndRich(int[][] richer, int[] quiet) {
        n = quiet.length;
        dp = new int[n];
        lis = new ArrayList[n];
        Arrays.fill(dp, -1);
        int res[] = new int[n];
        for (int i = 0; i < n; i++)
            lis[i] = new ArrayList<>();
        for (int i[] : richer) {
            lis[i[1]].add(i[0]);
        }
        for (int i = 0; i < n; i++) {
            res[i] = dfs(i, quiet);
        }
        return res;
    }

    public int dfs(int ind, int[] quiet) {
        if (dp[ind] != -1)
            return dp[ind];
        int minIndex = ind, minQuiet = quiet[ind];
        for (int i : lis[ind]) {
            int min = dfs(i, quiet);
            if (quiet[min] < minQuiet) {
                minQuiet = quiet[min];
                minIndex = min;
            }
        }
        return dp[ind] = minIndex;
    }
}

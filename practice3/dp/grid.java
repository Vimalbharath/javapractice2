package practice3.dp;

import java.util.HashMap;

public class grid {
    public static void main(String[] args) {
        Long ans = gridways(18, 18);
        System.out.println(ans);
    }

    static HashMap<Integer, Long> memo = new HashMap<>();
    static Long result = 0l;

    public static Long gridways(int row, int col) {
        if (memo.containsKey(row,col))
        if (row == 1 || col == 1) {
            return 1l;
        }
        result= gridways(row - 1, col) + gridways(row, col - 1);
        memo.put
    }
}

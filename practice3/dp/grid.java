package practice3.dp;

public class grid {
    public static void main(String[] args) {
        int ans = gridways(3, 3);
        System.out.println(ans);
    }

    public static int gridways(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }
        return gridways(row - 1, col) + gridways(row, col - 1);
    }
}

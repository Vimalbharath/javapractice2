package recursion.maze;

import java.util.Arrays;

public class NQueens {

    public static void main(String[] args) {
        boolean[][] board = new boolean[3][3];
        int count = queens(board, board.length);
        System.out.println(count);
    }

    private static int queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe()) {
                board[row][col] = true;
                count = count + queens(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static void display(boolean[][] board) {
        for (boolean[] ans : board) {
            Arrays.toString(ans);
        }
    }

    private static boolean isSafe() {

    }

}
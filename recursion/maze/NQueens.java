package recursion.maze;

import java.util.Arrays;

public class NQueens {

    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        int count = queens(board, 0);
        System.out.println(count);
    }

    private static int queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count = count + queens(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static void display(boolean[][] board) {
        for (boolean[] ans : board) {
            // System.out.println(Arrays.toString(ans));
            for (boolean element : ans) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // upside check
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // left
        int left = Math.min(row, col);
        for (int i = 1; i <= left; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        // right
        int right = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= right; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }
        return true;
    }

}
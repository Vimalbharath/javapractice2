package recursion;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 7, 9, 55, 79 };
        boolean ans = sortedarr(arr, 1, arr.length);
        System.out.println(ans);
    }

    private static boolean sortedarr(int[] arr, int i, int j) {
        if (j <= 1) {
            return true;
        }
        return arr[i] > arr[i - 1] && sortedarr(arr, i + 1, j - 1);
    }
}
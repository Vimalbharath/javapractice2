package recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 8, 2, 9, 0, 1 };
        int target = 2;
        boolean ans = linear(arr, target, 0);
        System.out.println(ans);

    }

    private static boolean linear(int[] arr, int target, int i) {
        if (i == arr.length) {
            return false;
        }
        // if (arr[i] == target) {
        // return true;
        // }
        return arr[i] == target || linear(arr, target, i++);
    }

}

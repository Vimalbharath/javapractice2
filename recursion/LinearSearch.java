package recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 8, 2, 9, 0, 1 };
        int target = 2;
        int ans = linear(arr, target, 0);
        System.out.println(ans);

    }

    private static int linear(int[] arr, int target, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return linear(arr, target, i++);
    }

}

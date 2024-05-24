package recursion;

public class Binary {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 8, 9, 11 };
        int ans = binarysearch(arr, 11, 0, arr.length);
        System.out.println(ans);
    }

    private static int binarysearch(int[] arr, int target, int s, int e) {

        int m = s + (e - s) / 2;
        if (e < s) {
            return -1;
        }
        if (arr[m] == target) {
            return m;
        } else if (arr[m] > target) {
            return binarysearch(arr, target, s, m - 1);
        } else

        {
            return binarysearch(arr, target, m + 1, e);
        }

    }
}

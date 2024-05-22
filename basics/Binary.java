package basics;

public class Binary {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 8, 9, 11 };
        int num = 11;
        int ans = binarysearch(arr, num);
        System.out.println(ans);

    }

    private static int binarysearch(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == num) {
                return mid;
            }
            if (arr[mid] < num) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return -1;
    }
}

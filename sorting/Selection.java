package sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = { 8, 7, 6, -2, 5, 4, 3, 2 };
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionsort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int last = arr.length - i;
            int maxindex = max(arr, start, last);
            swap(arr, maxindex, last);
        }
    }

    private static void swap(int[] arr, int maxindex, int last) {
        int temp = arr[maxindex];
        arr[maxindex] = arr[last];
        arr[last] = temp;

    }

    private static int max(int[] arr, int start, int last) {
        int max = start;
        for (int i = 0; i < last; i++) {
            if (arr[i] > arr[start]) {
                max = i;
            }
        }
        return max;
    }
}

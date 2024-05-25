package recursion.sorting;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };

        arr = mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] mergesort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int m = arr.length / 2;

        int[] left = mergesort(Arrays.copyOfRange(arr, 0, m));
        int[] right = mergesort(Arrays.copyOfRange(arr, m, arr.length));

        return join(left, right);
    }

    private static int[] join(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length) {
            while (j < second.length) {
                if (first[i] < second[j]) {
                    mix[k] = first[i];
                    i++;
                    k++;
                } else {
                    mix[k] = second[j];
                    j++;
                    k++;
                }
            }
        }
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }

}
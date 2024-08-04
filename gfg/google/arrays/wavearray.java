package gfg.google.arrays;

public class wavearray {

    public static void convertToWave(int n, int[] arr) {
        // code here
        for (int i = 0; i < arr.length - 1; i = i + 2) {

            swap(i, i + 1, arr);
        }
    }

    public static void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}

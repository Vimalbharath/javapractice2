package gfg.google.arrays;

import java.util.Arrays;

public class freq {

    int majorityElement(int a[], int size) {
        // your code here
        int count = 1;
        double condition = size / 2;
        Arrays.sort(a);
        if (size == 1) {
            return a[0];
        }
        for (int i = 0; i < a.length - 1; i++) {

            if (a[i] == a[i + 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count > condition) {
                return a[i];
            }

        }
        return -1;
    }
}

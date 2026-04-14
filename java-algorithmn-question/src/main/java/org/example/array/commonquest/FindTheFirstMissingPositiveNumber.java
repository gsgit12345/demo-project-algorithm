package org.example.array.commonquest;

import java.util.HashSet;
import java.util.Set;

public class FindTheFirstMissingPositiveNumber {
    public static void main(String str[]) {
        int arr[] = new int[]{1, 2, 3, 5, 6, 7, 8};

        missingPositiveNumber(arr);
    }

    public static void missingPositiveNumber(int arr[]) {
        Set<Integer> set = new HashSet<>();
        int counter = 0;
        for (int v : arr) {
            if (v > 0) {
                set.add(v);
            }
        }
        int missing = 1;
        while (set.contains(missing)) {
            missing++;
        }
        System.out.println(missing);
    }
}

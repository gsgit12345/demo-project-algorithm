package org.example.array.commonquest.leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArrayWithoutExtraSpace_leetcode_88 {
    public static void main(String str[]) {
        int nums1[] = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int nums2[] = {2, 5, 6};
        int n = 3;
        //  Output: [1,2,2,3,5,6]
        mergeTwoArrayInPlace(nums1, m, nums2, n);

        //using java 8 technique


    }

    public static void mergeTwoArrayInPlace(int arr1[], int m, int arr2[], int n) {
        int a = m - 1;
        int b = n - 1;
        int k = n + m - 1;

        while (a >= 0 && b >= 0) {
            if (arr1[a] > arr2[b]) {
                arr1[k--] = arr1[a--];
            } else {
                arr1[k--] = arr2[b--];
            }
        }
        while (b >= 0) {
            arr1[k--] = arr2[b--];
        }
        System.out.println(Arrays.toString(arr1));
    }
}

package org.example.abdulbukhari_ds.mergesort;

import java.util.Arrays;

public class MergeTheSortedArray {
    public static void main(String str[]) {
        int array[] = {1, 2, 3, 4, 5, 6};
        int arr[] = {8, 9, 10, 11, 12, 13, 14, 15, 16, 17};

       int result[]= mergeTwoSortedArray(array,arr);
       System.out.println(Arrays.toString(result));
    }

    public static int[] mergeTwoSortedArray(int arr[], int arr2[]) {
        int i = 0;
        int j = 0;
        int n = arr.length;
        int m = arr2.length;
        int merged[] = new int[n + m];
        int k = 0;
        while (i < n && j < m) {
            if (arr[i] < arr2[j]) {
                merged[k++] = arr[i++];
            } else {
                merged[k++] = arr2[j++];

            }
        }
        while (i < n) {
            merged[k++] = arr[i++];
        }
        while (j < m) {
            merged[k++] = arr2[j++];

        }

        return merged;
    }
}

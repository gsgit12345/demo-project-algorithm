package org.example.abdulbukhari_ds;

import java.util.Arrays;

public class QuickSortDemo {
    public static void main(String str[]) {
        int arr[] = {2, 1, 32, 12, 11, 44, 55, 6, 7, 8, 1, 3, 13};

        mergedSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void mergedSort(int arr[], int l, int high) {
        if (l < high) {
            int j = partionArray(arr, l, high);
            mergedSort(arr, l, j-1);
            mergedSort(arr, j + 1, high);

        }
    }

    public static int partionArray(int arr[], int l, int h) {
        int i = l;
        int j = h+1;
        int pivot = arr[l];
        while (i < j) {
            do {
                i++;
            } while (i<=h && arr[i] <= pivot);
            do {
                j--;
            } while (j>=l && arr[j] > pivot);
            if (i < j) {
                swap(arr,i, j);
            }
        }
        swap(arr,l, j);
        return j;
    }

    public static void swap(int arr[],int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;


    }
}

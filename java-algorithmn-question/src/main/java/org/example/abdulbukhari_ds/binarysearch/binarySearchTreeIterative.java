package org.example.abdulbukhari_ds.binarysearch;

public class binarySearchTreeIterative {
    public static void main(String str[]) {
        // 1-Pre-requisete of binary search tree is it should be in sorted array
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 12, 34};
        int low = 0;
        int high = arr.length-1;

    }

    public static int binarySearchIterative(int arr[], int low, int high, int key) {


        while (low <= high) {
           // int mid = (low + high) / 2; //this  will create integer overflow
            int mid = low + (high - low) / 2; //this will not create integer overflow

            if (key == arr[mid])
                return mid;
            if (key > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return 0;
    }
}

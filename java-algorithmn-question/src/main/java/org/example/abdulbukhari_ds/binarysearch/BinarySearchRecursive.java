package org.example.abdulbukhari_ds.binarysearch;

public class BinarySearchRecursive {
    public static void main(String str[]) {
        int arr[] = {21, 22, 23, 24, 25, 26, 27, 28, 31};
     int index=   binarySearchRecursive(arr, 1, arr.length, 24);

     System.out.println(arr[index]+"index:"+index);

    }

    public static int binarySearchRecursive(int arr[], int low, int high, int key) {

        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == key) {
            return mid;   //small problem
        } else {
            if (arr[mid] < key) {
                return binarySearchRecursive(arr, mid + 1, high, key);
            } else {
                return binarySearchRecursive(arr, low, mid - 1, key);

            }
        }
    }
}

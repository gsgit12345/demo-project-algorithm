package org.example.backtrackingandrecursion;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class ArrayOperationUsingRecursion {
    public static void main(String str[]) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int idx = 0;
        displayTheArray(arr, idx);
        int idx1 = 0;
        printArrayInReverse(arr, idx1);
        int arr2[] = {12, 31, 4, 1, 44, 22, 11, 99, 104, 5};

        System.out.println("max is:" + findMaxInArray(arr2, idx));

        System.out.println(findMaxInArrayUnsorted(arr2));
        System.out.println(findMaxInArrayUnsorted2(arr2));
        System.out.println(getMininArray(arr2));
    }

    public static void displayTheArray(int arr[], int idx) {
        if (arr.length == idx)
            return;
        System.out.println(arr[idx]);
        displayTheArray(arr, ++idx);
    }

    public static void printArrayInReverse(int arr[], int idx) {
        if (arr.length == idx) {
            return;
        }
        printArrayInReverse(arr, idx + 1);
        System.out.println(arr[idx]);
    }

    public static int findMaxInArray(int arr[], int idx) {
        //it is not best for 1 million record .it will give stack overflow
        if (arr.length - 1 == idx)
            return arr[idx];
        int max = findMaxInArray(arr, idx + 1);
        int result = arr[idx];
        if (max > arr[idx]) {
            return max;
        } else {
            return arr[idx];
        }

    }

    public static int findMaxInArrayUnsorted(int arr[]) {
        int max = arr[0];
        // int arr2[] = {12, 31, 4, 1, 44, 22, 0, 99, 104, 5};
        for (int m : arr) {
            max = Math.max(max, m);
        }
        return max;
    }

    public static int findMaxInArrayUnsorted2(int arr[]) {
        int max = arr[0];
        // int arr2[] = {12, 31, 4, 1, 44, 22, 0, 99, 104, 5};
        for (int i = 1; i < arr.length - 1; i++) {
            if ( arr[i]>max) {
                max = arr[i];
            }
        }
        //java 8

       OptionalInt max2= Arrays.stream(arr).max();
        System.out.println("java 8:"+max2.getAsInt());
        return max;
    }
    public static int getMininArray(int arr[])
    {
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
                min=arr[i];
        }
        return min;
    }
}

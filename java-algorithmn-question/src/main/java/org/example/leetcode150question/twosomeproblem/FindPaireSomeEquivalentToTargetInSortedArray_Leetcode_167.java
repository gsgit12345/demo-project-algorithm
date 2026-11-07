package org.example.leetcode150question.twosomeproblem;

import java.util.Arrays;

public class FindPaireSomeEquivalentToTargetInSortedArray_Leetcode_167 {
    public static void main(String str[]) {
        // 1- difference between 167 and 1 is that question-1 is unsorted array and
        // 167 is sorted array.it returns 1 based indices
        int array[] = {2, 7, 11, 12, 13};
        int target = 9;
        int ans[] = findTargetSumInSortedArrayUsingTwoPointer(array, target);

        System.out.println("found the indices:" + Arrays.toString(ans));
    }

    public static int[] findTargetSumInSortedArrayUsingTwoPointer(int array[], int target) {

        //note:-this solution is based on the two pointer approach
//        Two Pointer
//          ↓
//        O(n) time
//        O(1) space
        if (array == null || array.length == 0)
            throw new IllegalArgumentException("InvalidValue In array");
        int n = array.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int numTofind = array[left] + array[right];
            if (numTofind == target) {
                return new int[]{left + 1, right + 1};
            } else if (numTofind < target) {
                left++;
            } else {
                right--;
            }

        }

        return new int[]{};
    }

    public static int[] findTargetSumUsingBinarySearch(int array[], int target) {
        if (array == null || array.length < 0)
            throw new IllegalStateException("Array is not in correct format");
        for (int i = 0; i < array.length; i++) {
            int indices = binarySearch(array, target-array[i], i + 1, array.length - 1);
            if (indices != -1) {
                return new int[]{indices + 1, i + 1};
            }
        }
        return new int[]{};
    }

    public static int binarySearch(int array[], int target, int left, int right) {

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            }else if(array[mid]<target)
            {
                left=mid+1;
            }else
            {
                right =mid-1;
            }

        }

        return -1;
    }
}

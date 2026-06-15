package org.example.abdulbukhari_ds.monotonicstack;

public class createmaximumnumberarray_leetcode321 {

//    so i am creating  an array which  will contain maximum number
//    from both array and length would be 5 correct resulting array also make the same order
//    preserves relative order from nums1
//    preserves relative order from nums2
//    but interleaves both greedily.
}

/*

package org.example.monotonicstack;

import java.util.Arrays;

public class CreateMaximumNumber {

    public static void main(String[] args) {

        int nums1[] = {3, 4, 6, 5};
        int nums2[] = {9, 1, 2, 5, 8, 3};

        int k = 5;

        int result[] = maxNumber(nums1, nums2, k);

        System.out.println(Arrays.toString(result));
    }

    // Main Function
    public static int[] maxNumber(int[] nums1, int[] nums2, int k) {

        int m = nums1.length;
        int n = nums2.length;

        int result[] = new int[k];

        // how many elements we take from nums1
        for (int i = Math.max(0, k - n);
             i <= Math.min(k, m);
             i++) {

            // get maximum subsequence from nums1
            int arr1[] = getMaxSubsequence(nums1, i);

            // get maximum subsequence from nums2
            int arr2[] = getMaxSubsequence(nums2, k - i);

            // merge both arrays
            int merged[] = merge(arr1, arr2);

            // keep maximum answer
            if (greater(merged, 0, result, 0)) {
                result = merged;
            }
        }

        return result;
    }

    // Get maximum subsequence using monotonic stack
    public static int[] getMaxSubsequence(int nums[], int k) {

        int stack[] = new int[k];

        int top = -1;

        // how many elements we can remove
        int remove = nums.length - k;

        for (int num : nums) {

            // remove smaller elements
            while (top >= 0 &&
                    stack[top] < num &&
                    remove > 0) {

                top--;
                remove--;
            }

            // push into stack
            if (top + 1 < k) {

                stack[++top] = num;

            } else {

                // discard current element
                remove--;
            }
        }

        return stack;
    }

    // Merge two arrays
    public static int[] merge(int nums1[], int nums2[]) {

        int result[] = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int index = 0;

        while (i < nums1.length || j < nums2.length) {

            if (greater(nums1, i, nums2, j)) {

                result[index++] = nums1[i++];

            } else {

                result[index++] = nums2[j++];
            }
        }

        return result;
    }

    // Compare remaining arrays lexicographically
    public static boolean greater(int nums1[], int i,
                                  int nums2[], int j) {

        while (i < nums1.length &&
                j < nums2.length &&
                nums1[i] == nums2[j]) {

            i++;
            j++;
        }

        // nums2 finished
        if (j == nums2.length)
            return true;

        // nums1 finished
        if (i == nums1.length)
            return false;

        return nums1[i] > nums2[j];
    }
}
 */
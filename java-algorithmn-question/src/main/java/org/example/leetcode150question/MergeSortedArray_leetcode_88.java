package org.example.leetcode150question;

import java.util.Arrays;

public class MergeSortedArray_leetcode_88 {
    public static void main(String str[]) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        // Output: [1,2,2,3,5,6]
        int arr[] = mergeTwoSortedArray(nums1, nums2, m, n);

        System.out.println(Arrays.toString(arr));
        secondApproach(nums1, m,nums2,  n);
    }

    public static int[] mergeTwoSortedArray(int arr[], int arr1[], int m, int n) {

return  null;
    }

    public static void secondApproach(int num1[],int m,int num2[],int n)
    {
        //O((m+n)log(m+n))   --time complexity
        for(int i=0;i<n;i++)
        {
            num1[m+i]=num2[i];
        }
        Arrays.sort(num1);
        System.out.println(Arrays.toString(num1));
    }
}
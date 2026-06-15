package org.example.leetcode150question;

import java.util.Arrays;

public class RemovetheAllOccuranceOfNumInArrayInplace_27 {
    public static void main(String str[]) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        //  Output: 2, nums = [2,2,_,_]

        int nums1[] = {0, 1, 2, 2, 3, 0, 4, 2};
        int val1 = 2;
        //  Output: 5, nums = [0,1,4,0,3,_,_,_]

        //we do not have to take third array .we have to remove in place
        removeAllOccurance(nums1,val1);

    }

    public static void removeAllOccurance(int num[], int value) {

        int arr[] = new int[num.length];
        int i = 0;
        for (int n : num) {
            if (n != value) {

                num[i] = n;
                i++;

            }
        }

        System.out.println((Arrays.toString(num))+":count:"+i);
    }

    public static void bruteForceApproac(int num[], int value) {
        int arr[] = new int[num.length];
        int i = 0;
        for (int n : num) {
            if (n != value) {
                arr[i++] = n;
            }
        }

        System.out.println((Arrays.toString(arr)));
    }
}

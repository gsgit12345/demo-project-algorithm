package org.example.leetcode150question.threesum;

import java.util.Arrays;

public class Leetcode_ThreesumClosest_16 {
    public static void main(String str[]) {
        //Sorting + two pointers

//        1. Sorting → enables the two-pointer technique.
//        2. Math.abs(sum - target) → calculates the distance from the target.
//        3. Pointer movement:
//        - sum < target → left++ → increase sum
//        - sum > target → right-- → decrease sum

        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        //ans is 2
        int[] nums1 = {-1, 2, 1, -4};
        int target1 = 10;
        //ans is 2


    }

    public static int closetSumTriplet(int arr[], int target) {
        if (arr == null || arr.length < 3)
            throw new IllegalArgumentException("Array is not correct");
        Arrays.sort(arr);  //we are doing because we want to leverage the two pointer approach

        int closest = arr[0]+arr[1]+arr[2];  //we are assuming that this is t
        // he first triplet closest sum sum or this is my initial answer.we are assuming
        for (int i = 0; i < arr.length - 2; i++) {
            int right = arr.length - 1;
            int left = i + 1;

            if (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {
                    return target;
                }

                //So Math.abs() gives us the distance from the target.we are not caring whether the sum above the target
              //  or below the target
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum; //here we are updating closet triplet sum
                }

                if (sum < target) {
                    left++; //our sum is too small.we need big sum
                } else {
                    right--;
                }
            }

        }
        return closest;
    }

}

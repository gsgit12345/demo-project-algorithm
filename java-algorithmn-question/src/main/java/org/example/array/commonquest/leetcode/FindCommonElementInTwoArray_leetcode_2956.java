package org.example.array.commonquest.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindCommonElementInTwoArray_leetcode_2956 {
    public static void main(String str[]) {
        // https://www.youtube.com/watch?v=KlSRlp6OQm4
        //https://www.youtube.com/watch?v=RGIBEF093XM
        int nums1[] = {2, 3, 2};
        int nums2[] = {1, 2};

//single instance of common element
        //all instance of common elemnt

        int result[] = findTheCommonElementInTwoArray_2956(nums1, nums2);
        System.out.print(Arrays.toString(result));
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = new int[]{1, 3, 4, 5, 6, 9, 8};

        findCommonElementUsingHashMap(arr1, arr2);
    }

    public static int[] findTheCommonElementInTwoArray_2956(int arr[], int arr2[]) {
        Set<Integer> first = new HashSet<>();
        Set<Integer> second = new HashSet<>();
        int cnt = 0;
        for (int v : arr) {
            first.add(v);
        }

        int cnt1 = 0;
        for (int v : arr2) {
            second.add(v);
        }
        for (int v : arr) {
            if (second.contains(v)) {
                cnt++;
            }
        }
        for (int v : arr2) {
            if (first.contains(v)) {
                cnt1++;
            }
        }

        return new int[]{cnt, cnt1};
    }

    public static void findCommonElementUsingHashMap(int arr[], int arr1[]) {

       // Time Complexity: O(m + n)
       // Auxiliary Space: O(m)



        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }
        System.out.print("[");
        for (int i = 0; i < arr1.length; i++) {
            if (hashMap.containsKey(arr1[i])) {
                hashMap.remove(arr1[i]);
                System.out.print(arr1[i] + " ");

            }
        }
        System.out.print("]");

        System.out.print(hashMap.toString());
    }
}

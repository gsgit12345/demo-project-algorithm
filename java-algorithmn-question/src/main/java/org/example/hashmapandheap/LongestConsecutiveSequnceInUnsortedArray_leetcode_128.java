package org.example.hashmapandheap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestConsecutiveSequnceInUnsortedArray_leetcode_128 {
    public static void main(String str[]) {
        //   https://leetcode.com/problems/longest-consecutive-sequence/description/
        // Given an unsorted array of integers nums,
        // return the length of the longest consecutive elements sequence.
//  https://www.youtube.com/watch?v=YWXbu5uyGXs&list=PL-Jc9J83PIiHq5rMZasunIR19QG3E-PAA&index=9
        int nums[] = {100, 4, 200, 1, 3, 2};
        // Output: 4

        int nums1[] = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        //  Output: 9

        int nums2[] = {1, 0, 1, 2};
        // Output: 3

        int length = getLongestConsecutiveSequence(nums);
        System.out.println("len::" + length);
        int len = usingSetToFindLongestConsecutiveSequence(nums);
        System.out.println("len is:" + len);

    }
public static List<Integer> getConsecutiveSequence(int arr[])
{

    return null;
}
    public static int usingSetToFindLongestConsecutiveSequence(int num[]) {
        Set<Integer> set = new HashSet<>();

        for (int n : num) {
            set.add(n);
        }
        int longest = 0;
        for (int n : num) {
            int left = n - 1;
            if (!set.contains(left)) {
                int right = n;
                int len = 1;
                while (set.contains(right + 1)) {
                    right++;
                    len++;
                }
                longest = Math.max(longest, len);
            }
        }
        return longest;
    }

    public static int getLongestConsecutiveSequence(int arr[]) {
        // HashMap + Boundary merging technique

        HashMap<Integer, Integer> sequnce = new HashMap<>();

        int longest = 0;
        for (int a : arr) {
            if (!sequnce.containsKey(a)) {
                int left = sequnce.getOrDefault(a - 1, 0);//if it contains then return otherwise return 0
                int right = sequnce.getOrDefault(a + 1, 0);

                int total = left + right + 1;
                // Put current number with total sequence length
                sequnce.put(a, total);

                // Update left boundary of sequence
                // (start of sequence gets updated length)
                sequnce.put(a - left, total);
                // Update right boundary of sequence
                // (start of sequence gets updated length)
                sequnce.put(a + right, total);

                longest = Math.max(longest, total);
            }


        }

        return longest;
    }

}

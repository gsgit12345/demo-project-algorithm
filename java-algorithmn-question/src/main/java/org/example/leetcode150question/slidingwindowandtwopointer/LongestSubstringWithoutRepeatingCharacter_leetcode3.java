package org.example.leetcode150question.slidingwindowandtwopointer;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacter_leetcode3 {
    public static void main(String str[]) {
//        //1-Longest Substring Without Repeating Characters
//        2-take three variable right and assign the string length
//        3-take left and max and assign 0
//        1-run a loop from 0 to the string.length
//        2-Take a set  and check that character exist or not .if exist then remove from set
//        3-Increment the left and remove the left

        String st = "abcabcbb"; //ans: abc
    }

    public static int longestSubstringWithoutRepeatingCharacter(String str) {

        // Space:O(n)

       // O(min(n,charset))

        // note:-this solution will work with ascii and unicode character set.Both
        // set base implementaion and map base implementation
        if (str == null)
            return 0;

        HashSet<Character> holder = new HashSet<>();
        // Stores maximum length found so far
        int max = 0;

        // Left boundary of sliding window
        int left = 0;

        // Expand window by moving right pointer
        for (int right = 0; right < str.length(); right++) {

            // If duplicate character is found,
            // keep shrinking window from left
            // until duplicate is removed
            char ch = str.charAt(right);
            if (holder.contains(ch)) {    //removing the duplicate from the string
                holder.remove(str.charAt(left));
                left++;
            }
            // Add current character into window
            holder.add(ch);
            // Calculate current window size
            int currentWindowLength = right - left + 1;

            max = Math.max(max, currentWindowLength);

        }

        return max;
    }
    public static int longestSubstringWithoutRepeatingCharacterMap(String str)
    {
        return 0;
    }

    public static int longestSubstringWithoutRepeatingCharacterArraybase(String str)
    {
        //1-This solution will work foor ascii character
        return 0;
    }
}

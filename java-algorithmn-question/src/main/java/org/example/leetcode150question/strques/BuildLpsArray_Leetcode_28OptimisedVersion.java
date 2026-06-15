package org.example.leetcode150question.strques;

public class BuildLpsArray_Leetcode_28OptimisedVersion {
    public static void main(String str[]) {
        String text = "abacade";

        String pattern="ac";

    }

    public static int[] buildLpsArray(String pattern) {
        //this is for creating longest prefix suffix array
        if (pattern == null)
            return null;
        //    // Stores the LPS value for every index
        int lps[] = new int[pattern.length()];//this is the lps array where we will store the length of
        //   the prefix and suffix length
        int len = 0;

        // LPS of first character is always 0
        int i = 1;
        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                // Increase the current prefix-suffix length;
                // Store current longest prefix-suffix length
                lps[i] = len;                   // Store it in lps array
                i++;                    // Move to next character

            } else {
                // Mismatch occurred
                if (len != 0) {
                    len = lps[len - 1]; // go back in the lps array and pick the matching prefix and suffix
                } else {

//                    * No prefix-suffix available.
//                     * Therefore LPS value is 0.

                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    public static int kmpSearchOptimised_leetcode_28(String text, String pattern) {

        if (text == null || pattern == null)
            return -1;

        if (pattern.length() == 0)
            return 0;

        int lps[] = buildLpsArray(pattern);
        int i = 0;
        int j = 0;
        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
                // entire match
                if (j == pattern.length()) {
                    return i - j;
                }
            } else {
                // Mismatch occurred
                if (j != 0) {
                   j=lps[j-1]; // Use LPS to avoid unnecessary comparisons

                } else {
                    // No prefix-suffix available
                i++;
                }
            }
        }

        return -1;

    }
}

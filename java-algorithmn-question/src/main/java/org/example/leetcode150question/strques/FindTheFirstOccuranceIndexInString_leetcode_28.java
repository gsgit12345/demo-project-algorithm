package org.example.leetcode150question.strques;

public class FindTheFirstOccuranceIndexInString_leetcode_28 {
    public static void main(String str[]) {
//        1-run the loop from i=0 till n-m where n is the length of heystack
//        and m is the length of needle
//        2-create the substring from i to m and check that hestack is equal to it or not
//        3-if equal return the i or -1
//        4-if needle length greater of the heystack length then also return the -1

        String haystack = "sadbutsad";
        String needle = "sad";
        String haystack1 = "leetcode";
        String needle1 = "leeto";
        String haystack2 = "hello";
        String needle2 = "ll";
        String haystack3 = "mississippi";
        String needle3 = "issip";

        //LeetCode 28    -> Naive Search    leading question
        //LeetCode 28    -> KMP Version
        //LeetCode 459   -> Repeated Substring Pattern
        //LeetCode 686   -> Repeated String Match
        //LeetCode 796   -> Rotate String
        //LeetCode 1392  -> Longest Happy Prefix
        //LeetCode 214   -> Shortest Palindrome
        // KMP Algorithm
        //Z Algorithm

        //question based on lps and kmp
//        LeetCode 459
//        LeetCode 686
//        LeetCode 214
//        LeetCode 1392
//        LeetCode 796

    }

    public static int findTheFirstSubstringIndexIntoAnotherString_BruitForce(String sourceTre, String pattern) {
        //this is the brutforce approach and time complexity would be (m*n)
        //This problem could be solved using the Kmp search algo where we have to build
        // lps array that is longest prefix substring array
//time =O(n×m)
//space=o(m)
        int n = sourceTre.length();
        int m = pattern.length();
        if (sourceTre == null || pattern == null) return -1;

        if (m > n) // means pattern is lengthy rather than to the source string
            return -1;

        for (int i = 0; i < n - m; i++) {
            String sub = sourceTre.substring(i, i + m);
            if (pattern.equals(sub)) {
                return i;
            }

        }


        return -1;
    }

    public static int betterBruteForceSpaceBig1(String text, String pattern) {
        if (text == null || pattern == null) {
            return -1;
        }

        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i < n - m; i++) {
            int j = 0;
            while (j < m && text.charAt(i + j) == pattern.charAt(j)) {
                j++;
            }
            if (j == m) {
                return i;
            }
        }


        return -1;
    }
}

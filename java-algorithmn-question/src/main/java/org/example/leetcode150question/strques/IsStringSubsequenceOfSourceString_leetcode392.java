package org.example.leetcode150question.strques;

public class IsStringSubsequenceOfSourceString_leetcode392 {
    public static void main(String str[]) {

//        LeetCode 28
//        LeetCode 524
//        LeetCode 2486
//        LeetCode 792

//        1-we have two string source and pattern .we have to check that pattern exist or can be formed
//         from the source either deleting or not.if it can be formed we have to return true or false
//        2-we can solve using two pointer approach.first pointer will run for the source and second pointer
//        will run for the second
//        3- we will put the if condition where we have to check that character in both string is matching or not
//        4-If matching we have to increase the pattern string pointer
//        5-we will increment the source string pointer everytime

        String pattern = "abc";
        String text = "ahbgdc";

        Boolean result = isStringSubsequenceOfTheSourceString(text, pattern);
        System.out.println(result);
    }

    public static boolean isStringSubsequenceOfTheSourceString(String text, String pattern) {

        // Time:- big(n)  and space big(1)
        if (text == null || pattern == null)
            return false;

        if (pattern.length() > text.length())
            return false;
        int j = 0;
        int i = 0;
        while (i < text.length() && j < pattern.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == pattern.length();
    }

    public static boolean bruteForceApproach(String text, String pattern) {
        if (text == null || pattern == null)
            return false;
        if (pattern.length() > text.length())
            return false;

        String sub = "";
        return generateSubsequence(text, 0, sub, pattern);
    }

    public static boolean generateSubsequence(String text, int index, String sub, String pattern) {

        //Space Complexity = O(n)
        // Time Complexity = O(n*2ⁿ)  where n comparing string
        if (sub.length() == pattern.length())
            return true;
        if (index == text.length())
            return false;

        //include the current character
        if (generateSubsequence(text, index + 1, sub + text.charAt(index), pattern))
            return true;

        // Exclude current character
        return generateSubsequence(text, index + 1, sub, pattern);

    }
}

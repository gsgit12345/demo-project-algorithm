package org.example.leetcode150question.strques;

import java.util.Arrays;

public class LongestCommonPrefix_leetcode14 {
    public static void main(String str[]) {
        String strs[] = {"flower", "flow", "flight"};
        //  Output: "fl"

        String strs1[] = {"dog", "racecar", "car"};
        // Output: ""

        String out = longestCommonPrefix(strs);
        System.out.println(out);

    }

    public static String longestCommonPrefix(String st[]) {
        int index = 0;
        Arrays.sort(st);
        String first = st[0];
        String last = st[st.length - 1];
//        O(n log n * m)
//        where:
//        n = number of strings
//        m = average string length
        //  O(log n)  or O(n)
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(index) == last.charAt(index)) {
                index++;
            } else {
                break;
            }
        }

        return index < 0 ? "" : first.substring(0, index);
    }

    public static String optimalApproachWithoutSorting(String str[]) {
        String ch = str[0];

        //time complexity=O(n * m)
        // spacde==  O(1)
        for (int i = 0; i < ch.length(); i++) {
            char chr = ch.charAt(i);

            for (int j = 1; j < str.length; j++) {
                // i is the current character position/index
                // str[j] current string
                // str[j] we are comparing current string index with first string character
                if (i >= str[j].length()||str[j].charAt(i) != chr) {
                        return ch.substring(0, i);

                }
            }
        }
        return ch;
    }
}

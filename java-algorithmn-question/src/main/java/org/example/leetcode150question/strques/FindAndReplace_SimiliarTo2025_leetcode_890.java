package org.example.leetcode150question.strques;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAndReplace_SimiliarTo2025_leetcode_890 {
    public static void main(String str[]) {
//        1-This question is similar to leetcode_205.The difference is this question contains the list of word
//          and 205 is working on two string.in logic both question is same

       String  words[] = {"abc","deq","mee","aqq","dkd","ccc"};
       String pattern = "abb";
      //  Output: ["mee","aqq"]
       String  words1[] = {"a","b","c"};
       // Output: ["a","b","c"]
        String pattern1 = "a";

        List<String> ans= findAndReplace(words1,pattern1);
       System.out.println(ans);
    }

    public static List<String> findAndReplace(String[] words, String pattern) {
        List<String> answer=new ArrayList<>();
        for (String source : words) {
            if( matchesPattern(source, pattern))
            {
             answer.add(source);
            }
        }
        return answer;
    }

    public static boolean matchesPattern(String s, String p) {

        List<String> word = new ArrayList<>();

        if (s.length() != p.length())
            return false;
        Map<Character, Character> s_map = new HashMap<>();
        Map<Character, Character> p_map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char s_ch = s.charAt(i);
            char p_ch = p.charAt(i);
            if (s_map.containsKey(s_ch)) {
                if (s_map.get(s_ch) != p_ch) {
                    return false;
                }
            } else {
                s_map.put(s_ch, p_ch);
            }
            if (p_map.containsKey(p_ch)) {
                if (p_map.get(p_ch) != s_ch) {
                    return false;
                }
            } else {
                p_map.put(p_ch, s_ch);
            }
        }
        return true;
    }
}

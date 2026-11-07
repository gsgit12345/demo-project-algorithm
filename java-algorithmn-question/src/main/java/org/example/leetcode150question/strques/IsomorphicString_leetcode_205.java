package org.example.leetcode150question.strques;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString_leetcode_205 {
    public static void main(String str[]) {
//        1-check two strings are isomorphic or not
//        2- s = "paper"
//           t = "title"
//        paper
//        ↓↓↓↓↓
//        title   ❌ yes Isomorphic

//        s = "badc"
//        t = "baba"
//        b -> b
//        a -> a
//        d -> b     ❌ Not Isomorphic

//        1-create two map for two string map_s and map_t
//        2-check the length of the two string if length is not same then return false
//        3-traverse the string and take the character from the both character
//        4-name char_c and char_t and first check in map_s that char_c exist.
//        5-if true then check that map_s.get(char_c)!=char_t
//        6-repeat the same for the other map_t
//          7-return false in all scenario check
//          8-At the last return the true

       //  leetcode -890 is similiar to it

       String s= "egg";
       String t="add";

        String s1= "badc";
        String t1="baba";

       System.out.println(isStringIsomorphic(t1,s1));

    }

    public static boolean isStringIsomorphic(String t, String s) {
//       time -
//       +O(n)
//        Space:
//        O(n)

        Map<Character, Character> t_hashMap = new HashMap<>();
        Map<Character, Character> s_hashMap = new HashMap<>();

        if (t == null || s == null || t.length() != s.length())
            return false;

        for (int i = 0; i < t.length(); i++) {
            char t_ch = t.charAt(i);
            char s_ch = s.charAt(i);
            if (t_hashMap.containsKey(t_ch)) {
                if (t_hashMap.get(t_ch) != s_ch) {
                    return false;
                }
            }else {
                t_hashMap.put(t_ch,s_ch)  ;
            }
            if (s_hashMap.containsKey(s_ch)) {
                if (s_hashMap.get(s_ch) != t_ch) {
                    return false;
                }
            }else {
                s_hashMap.put(s_ch,t_ch)  ;
            }
        }

        return true;
    }
}

package org.example.leetcode150question.strques.anagramproblem;

public class ValidAnagram_leetcode_242 {
    public static void main(String str) {
        //string is anagram if both  string has the identical string but order does not matter
        //lenth should be same
        // like  like heart  and earth  cat
        //act
        // solution
//        1-first check the length and compare that both string length is same or not
//        2-Take a counter of 26 length
//        3-Run a loop till first string and increment the counter
//        4-Then decrement the counter in the same loop for second string
//        5- then check that counter[i]<0 is zero then return false
//        6-from function always return true
//
 //https://algo.monster/liteproblems/242
    }

    public static boolean isValidAnagram(String s, String t) {

//        1-time o(n)
//        2-Space o(1)

        if (s.length() != t.length()) {
            return false;
        }
        int counter[] = new int[256];  //it will work ascii character
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
            ;

        }

        for (int i = 0; i < 26; i++) {
            if (counter[i] != 0)
                return false;
        }
        return true;
    }

    public static boolean isValidAnagramForAllCharacterType(String s,String t)
    {
//           1-this problem we can solve using the hashmap where traverse the first string and put character
//            as key and frequency as count+1;
//           2-put the second string also in the same hashmap but decrese the frequency -1
//           3-and in the second string loop chek that map.get(ch)< 0 if yes return false
//           4-from function always return the true

        return true;
    }
}

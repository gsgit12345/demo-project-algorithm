package org.example.backtrackingandrecursion;

import java.util.HashMap;
import java.util.Map;

public class CountDistinctSubsequnceOfString_Leetcode940 {
    public static void main(String str[]) {

    }

    public static int countDistinctSubsequnceOfAString(String str) {
//        1. Take input string s, let n = length of s
//        2. Create dp array of size n + 1
//        3. Initialize dp[0] = 1 and array would be long
//        4. Create a map lastOcc to store last index (1-based) of each character
//        5. Loop from i = 1 to n
//        6. Get current character:
//          ch = s[i - 1]
//        7. Double previous count:
//         dp[i] = 2 * dp[i - 1]
//        8. If ch exists in lastOcc:
//           j = lastOcc[ch]
//          dp[i] = dp[i] - dp[j - 1]
//        9. Update map:
//           lastOcc[ch] = i
//        10. Return final result:
//          dp[n] - 1
//
 //space and time big(n)
  // we can not use it for generate all subsequnce
        int n = str.length();
        long dp[] = new long[n + 1];
        dp[0] = 1;
        Map<Character, Integer> lastOccMap = new HashMap<>();

        for (int i = 1; i <= str.length(); i++) {
            char ch = str.charAt(i - 1);
            dp[i] = 2 * dp[i - 1]; // each character has choice it will come or not

            if (lastOccMap.containsKey(ch)) { //removing the duplicate
                int j = lastOccMap.get(ch);
                dp[i] = dp[i] - dp[j - 1];  //we removing duplicate subsequnce
            }
            lastOccMap.put(ch, i);  //update last occurance
        }

        return (int) dp[n] - 1; //ignore the empty
    }
}

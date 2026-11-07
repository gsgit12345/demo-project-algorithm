package org.example.leetcode150question.twosomeproblem;

import java.util.HashMap;
import java.util.Map;

public class TwoSomePaireEquvalentToTarget_leetcode_1 {
    public static void main(String str[]) {
        int nums[] = {2, 7, 11, 15}, target = 9;
        //ans{0,1}
        int nums1[] = {3, 2, 4}, target1 = 6;
        //ans{1,2}


    }

    public static int[] findThePareEquivalentToTarget(int num[], int target) {

//        Time Complexity: O(n)
//        Space Complexity: O(n)
        Map<Integer, Integer> bucket = new HashMap<>();

        for (int i = 0; i < num.length; i++) {
            int required = target - num[i];
            if (bucket.containsKey(required)) {
                return new int[]{bucket.get(required), i};
            }
            bucket.put(num[i], i);
        }

        return new int[]{};
    }

    public static int[] convertTheAboveSolutionInJava8(int num[], int target) {
        return null;
    }
}

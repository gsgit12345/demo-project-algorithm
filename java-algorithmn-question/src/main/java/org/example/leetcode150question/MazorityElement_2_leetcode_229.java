package org.example.leetcode150question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MazorityElement_2_leetcode_229 {
    public static void main(String str[]) {
        //tell the mazority number in array which appear more than n/3

        int nums[] = {3, 2, 3};
        // Output: [3]

        int nums1[] = {1};
        // Output: [1]

        int nums2[] = {1, 2};
        //Output: [1,2]
       List<Integer> result= getMazorityElementHashMap(nums);

       System.out.println((result));

    }

    public static List<Integer> getMazorityElement(int num[]) {
        List<Integer> list = new ArrayList<>();

        return list;
    }

    public static List<Integer> getMazorityElementHashMap(int num[]) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int n : num) {
            if (frequency.containsKey(n)) {
                frequency.put(n, frequency.getOrDefault(n, 0) + 1);
            }
        }
        int mazor = num.length / 3;
        for(Map.Entry<Integer,Integer> entry: frequency.entrySet())
        {
            if(entry.getValue()>mazor)
            list.add(entry.getKey());
        }
        return list;
    }
}

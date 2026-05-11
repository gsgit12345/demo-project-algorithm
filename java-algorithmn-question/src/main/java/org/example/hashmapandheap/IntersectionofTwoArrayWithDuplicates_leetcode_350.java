package org.example.hashmapandheap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntersectionofTwoArrayWithDuplicates_leetcode_350 {

    public static void main(String str[]) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        // Output: [2,2]

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};

        //Time Complexity:--o(n+m) where n and m are array length
        // space O(n)

        getCommonElementWithDuplicate(nums3,nums4);
    }

    public static int[] getCommonElementWithDuplicate(int arr[], int[] arr2) {
        Map<Integer, Long> frquncy = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting()));

        List<Integer> result = new ArrayList<>();
        Arrays.stream(arr2).forEach(n -> {

                    if (frquncy.containsKey(n) && frquncy.get(n) > 0) {
                        result.add(n);
                        frquncy.put(n, frquncy.get(n) - 1);
                    }

                }
        );
        System.out.println(result);

      return   result.stream().mapToInt(Integer::intValue).toArray();
    }
}

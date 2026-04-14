package org.example.bitmanipulation;

public class FindAnElementThatAppearsOnlyOnce {
    public static void main(String str[]) {
        int[] nums = {2, 3, 5, 4, 5, 3, 4};
        int unique = 0;
        for (int val : nums) {
            unique = unique ^ val;
        }
        System.out.println("unique is ::"+unique);
    }
}

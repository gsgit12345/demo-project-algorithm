package org.example.abdulbukhari_ds.dynamicprogramming.o_1knapsak;

public class TargetSumSubsetInArray {

    public static void main(String str[]) {

        int arr[] = {2, 3, 4, 5, 6, 7};
        int target = 6;

        targetSumSubset(arr, target);
    }

    public static void targetSumSubset(int arr[], int target) {

        int n = arr.length;

        // dp[i][j]
        // i = number of elements considered
        // j = target sum
        // value = true/false
        // true  -> target sum can be formed
        // false -> target sum cannot be formed
        boolean dp[][] = new boolean[n + 1][target + 1];

        // rows -> elements
        // columns -> target sums
        for (int i = 0; i < dp.length; i++) {

            for (int j = 0; j < dp[0].length; j++) {

                // when no elements and target is 0
                // empty subset can always make sum 0
                if (i == 0 && j == 0) {

                    dp[i][j] = true;

                }

                // when no elements are available
                // positive target cannot be formed
                else if (i == 0) {

                    dp[i][j] = false;

                }

                // when target becomes 0
                // we can always make 0 by choosing no elements
                else if (j == 0) {

                    dp[i][j] = true;

                }

                else {

                    // exclude current element
                    // check if target was already possible
                    // using previous elements
                    if (dp[i - 1][j] == true) {

                        dp[i][j] = true;   //dp[i-1][j]  exclude area

                    } else {

                        // current element value
                        int val = arr[i - 1];

                        // include current element only if
                        // current target is >= current value
                        if (j >= val) {

                            // check if remaining target
                            // (j - val) was possible
                            // in previous row
                            if (dp[i - 1][j - val] == true) {   //include area

                                dp[i][j] = true;
                            }
                        }
                    }
                }
            }
        }

        // final answer
        // can target be formed using all elements?
        System.out.println(dp[n][target]);
    }
}
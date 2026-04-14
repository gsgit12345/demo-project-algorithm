package org.example.dynamicprogramming.dplevel1;

import java.util.Arrays;

public class CoinChangeCombinationproblemMinimumCoin_322 {
    public static void main(String str[]) {
        int coins[] = {1, 2, 5};
        int amount = 11;
        // Output: 3
        // Explanation: 11 = 5 + 5 + 1
        int result = coinChangeCombinationleetcodeUsingDp1(coins, amount);

        System.out.println("minimum coin:;" + result);

    }

    public static int coinChangeCombinationleetcodeUsingDp1(int[] coin, int amount) {

        int max = amount + 1;  //you can take Integer.MAX_VALUE
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;

        for (int i = 0; i < coin.length; i++) {
            for (int j = coin[i]; j <= amount; j++) {
                dp[j] = Math.min(dp[j], dp[j - coin[i]] + 1);
            }
        }
        return dp[amount] == max ? -1 : dp[amount];
    }

}


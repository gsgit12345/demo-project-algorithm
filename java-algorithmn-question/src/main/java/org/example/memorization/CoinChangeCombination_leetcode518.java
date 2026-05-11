package org.example.memorization;

public class CoinChangeCombination_leetcode518 {
    public static void main(String str[]) {
        //1-coin → amount --combination
        //2-dp[j] = number of ways to form amount j
        //3- “Looping coins first ensures combinations, avoiding duplicate permutations.”
        int[] coins = {2, 3, 5};
        int amount = 7;
        // ans   3,4 and 2+5 so ans=2

        int[] coins2 = {1, 2, 3};
        int amount1 = 4;
        // ans =4  1+1+1+1, 2+2, 1+1+2, 1+3
        int[] coins3 = {2, 4};
        int amount2 = 7;

       System.out.println( getCoinChangeCombination(amount1, coins2));

    }

    public static int getCoinChangeCombination(int amount, int coins[]) {
//        1-Declare a dp[amount+1];this is the array in which i will store number of way to form amount
//        2-Dp[0]=1 it means that there is one way to pay the amount.u do not give or take
//        3-we run a loop  on coins and we will take one coin at a time
//        4-then run a j loop starting from j=coin and till amount-1
//        5-then store the number of way to form amount dp[j]+=dp[j-coin]
//        6-return the dp[amount] thet is the answer
//        7-u  had put outer loop on coins that is stoping becoming combination
        int dp[] = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int j = coin; j <= amount; j++) {
                dp[j] += dp[j - coin];
            }
        }

        // we store the here number of way to get the amount
        // we will try all coin

        //coin is nothing but money like 1 or 2 or 3 rupees

        return dp[amount];

    }
}

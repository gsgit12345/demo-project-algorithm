package org.example.dynamicprogramming.dplevel1;

public class CoinChnageCombinationproblem_518 {

    public static void main(String str[]) {
        //https://leetcode.com/problems/coin-change-ii/description/
        //https://www.youtube.com/watch?v=l_nR5X9VmaI&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=13
        int coins[] = {1, 2, 5};
        int amount = 5; //ans =4
        int amount1 = 3;
        int coins1[] = {2};  //ans --1
        int amount2 = 10;
        int coins2[] = {10};
        // Output: 1

        int result = coinChangeCombinationleetcodeUsingDp(coins2, amount2);
        System.out.println(result);
    }

    public static int coinChangeCombinationleetcodeUsingDp(int coin[], int amount) {
//combination ignoore the order
        // we have to tell total number of way to make the payment
        // O(n * amount)
        //space (amount)
        //  dp[]={0,1,2,3,4,5};
        int dp[] = new int[amount + 1];  //this is array where we will store number of way to pay the amount
        dp[0] = 1;
        for (int i = 0; i < coin.length; i++) {
            for (int j = coin[i]; j < dp.length; j++) //coin[i]=1 it means how many way we can pay amount using 1
            //coin[2]=how many way we can pay amount using 2 coin
            //that is i am running loop from coin[i]
            {
                dp[j] += dp[j - coin[i]];
            }
        }
        return dp[amount];
    }

    public static int coinChangeCombinationleetcodeUsingDp1(int[] coin, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int i = 0; i < coin.length; i++) {
            for (int j = coin[i]; j <= amount; j++) {
                dp[j] += dp[j - coin[i]];
            }
        }
        return dp[amount];
    }

}

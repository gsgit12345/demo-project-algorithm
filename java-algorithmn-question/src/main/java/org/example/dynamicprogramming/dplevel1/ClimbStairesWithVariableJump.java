package org.example.dynamicprogramming.dplevel1;

public class ClimbStairesWithVariableJump {

    //here there is array in which we are storing how many jumps user can take
    public static void main(String str[]) {
        int n = 7; //total number of steps
        int k = 4;  // maximum number of steps that can be jumped at a time

        //if n=7 and k=2 =ans=21
        //if n=5 and k=3 =ans=13
        //if n=15 and k=5 =ans=13624
        //n=4 and k=4=ans=8

        int jumps[] = {1, 3, 5}; //ans 12 and n=7
        int result = countTheTotalWay(n, k);
        System.out.println("result is::" + result);

        int result2 = countNumberOfWayIfVariableJumpInFormOfArray(n, jumps);
        System.out.println(result2);

     int result1=   countNumberOfWayIfVariableJumpInFormOfArrayUsingRecursion(n,jumps);

        System.out.println(result1);

    }

    public static int countTheTotalWay(int n, int k) {
        //create the dp[n+1]  to store the total number of way
        // reaching on certain statires
      /*  dp[0] = 1 → base case
                dp[1] = dp[0] = 1
        dp[2] = dp[1] + dp[0] = 1 + 1 = 2
        dp[3] = dp[2] + dp[1] = 2 + 1 = 3
        dp[4] = dp[3] + dp[2] = 3 + 2 = 5
        dp[5] = dp[4] + dp[3] = 5 + 3 = 8
        dp[6] = dp[5] + dp[4] = 8 + 5 = 13
        dp[7] = dp[6] + dp[5] = 13 + 8 = 21
*/

        int dp[] = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                if ((i - j) >= 0) // on zeroth staire there is only one way that is store in the dp
                {
                    dp[i] += dp[i - j];
                }
            }
        }

        return dp[n];
    }

    public static int countNumberOfWayIfVariableJumpInFormOfArray(int n, int jum[]) {
        int dp[] = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int jums : jum) {
                if (i - jums >= 0) {
                    dp[i] += dp[i - jums];
                }
            }
        }
        return dp[n];
    }

    public static int countNumberOfWayIfVariableJumpInFormOfArrayUsingRecursion(int n, int jum[]) {

        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        int totalways = 0;
        for (int jumps : jum) {
            totalways += countNumberOfWayIfVariableJumpInFormOfArrayUsingRecursion(n - jumps, jum);
        }
        return totalways;
    }

    public static int countNumberOfWayIfVariableJumpInFormOfArrayUsingRecursionWithMemorization(int n, int jum[]) {
        return 0;
    }
}

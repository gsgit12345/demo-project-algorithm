package org.example.dynamicprogramming.dplevel1;

public class ClimbingStairesUsingMemorizationAndTabulization_leetcode70 {
    public static void main(String str[]) {
        //https://leetcode.com/problems/climbing-stairs/description/
        int n = 3;
        int total = findTotalStairePathUsingRecursion(n);

        System.out.println(total);

        int result = findTotalStairePathUsingMemorization(n, new int[n + 1]);
        System.out.println(result);

    }

    public static int findTotalStairePathUsingMemorization(int n, int dp[]) {

        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        int first = findTotalStairePathUsingMemorization(n - 1, dp);
        int second = findTotalStairePathUsingMemorization(n - 2, dp);
        //  int third = findTotalStairePathUsingRecursion(n - 3);
        //  int total = first + second + third;
        int total = first + second;
        dp[n] = total;
        return total;
    }

    public static int findTotalStairePathUsingTabulization(int n) {

        int dp[] = new int[n + 1];
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            if (dp[i] == 1) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }

        return dp[n];
    }

    public static int findTotalStairePathUsingRecursion(int n) {

        //n is number of jumps or s\teps like 1 ,2 ,3 etc
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        }
        int first = findTotalStairePathUsingRecursion(n - 1);
        int second = findTotalStairePathUsingRecursion(n - 2);
        //  int third = findTotalStairePathUsingRecursion(n - 3);


        //  int total = first + second + third;
        int total = first + second;
        return total;
    }
}

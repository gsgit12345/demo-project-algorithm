package org.example.memorization;

public class LargestSquareSubmatrixOrArea_leetcode221 {
    public static void main(String str[]) {
        int matrix[][] = {{1, 1, 1,},
                {1, 0, 1},
                {1, 1, 1}};
        //  ans=1
        int matrix1[][] = {{0, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}, {0, 1, 1, 1}};
        //  ans=3

        int matrix2[][] = {{1, 1, 1},
                {1, 1, 0},
                {1, 1, 0}};
        //ans=2

        int matrix3[][] = {{1, 1, 1, 1},
                {1, 1, 1, 1}};
        // ans=2

        int matrix4[][] = {{1, 1, 0, 1},
                {1, 1, 1, 1},
                {0, 1, 1, 1},
                {1, 1, 1, 0}};
        // ans 2

       int ans= findTheLargestSquareSubmatrixOf1(matrix);
       System.out.println(ans);

    }

    public static int findTheLargestSquareSubmatrixOf1(int arr[][]) {
        int n = arr.length;  //row
        int m = arr.length;  //column

        int dp[][] = new int[n][m];
        int ans = 0;
        for (int i = dp.length-1; i >= 0; i--)  //for row
        {
            for (int j = dp[0].length-1; j >= 0; j--) {
                //divide the matrix into four parts
                if (i == dp.length-1 && j == dp[0].length-1) {
                    dp[i][j] = arr[i][j];
                } else if (i == dp.length - 1) {
                    dp[i][j] = arr[i][j];

                } else if (j == dp[0].length-1) {
                    dp[i][j] = arr[i][j];

                } else {
                    if (arr[i][j] == 0) {
                        dp[i][j] = 0;
                    } else {
                        int min = Math.min(dp[i + 1][j], dp[i][j + 1]);
                        min = Math.min(min, dp[i + 1][j + 1]);
                        dp[i][j] = min + 1;
                        if (dp[i][j] > ans) {
                            ans = dp[i][j];
                        }
                    }
                }
            }
        }
        //if i do ans*ans then it will become leetcode version 221 and i have to change array as char array
        return ans;
    }
}
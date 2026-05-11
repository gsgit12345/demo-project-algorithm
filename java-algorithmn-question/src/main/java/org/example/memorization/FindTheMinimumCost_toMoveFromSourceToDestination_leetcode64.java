package org.example.memorization;

public class FindTheMinimumCost_toMoveFromSourceToDestination_leetcode64 {
    //    1-Find the minimum cost
//    2-Find The Minimum PathSum leetcode-64
    public static void main(String str[]) {

        int arr[][] = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        //ans=7    👉 Path: 1 → 3 → 1 → 1 → 1
        int[][] grid = {{1, 2, 3}, {4, 5, 6}};
        //Output: 12
        int[][] grid2 = {
                {5, 9, 2, 1}
        };
        // Output 17
        int[][] grid3 = {
                {2},
                {3},
                {1}
        };
//ans--6

        findTheMinimumCost(arr);

    }

    public static void findTheMinimumCost_leetcode64(int arr[][]) {

    }

    public static void findTheMinimumCost(int arr[][]) {
        int dp[][] = new int[arr.length][arr[0].length];

//        1-create the dp[][] which will store the minimum cost
//        2-run the loop from dp.lenth to i>0.this loop for row value
//        3-run the loop from dp[0].length till j>=0 on colum only
//        4-put if condition and solve the problem for last row and last column and store the same value in dp[i][j]=arr[i][j]
//        5-put the if condition and solve the problem for last row
//        6-put the if condition and solve the problem for last column
//        7-solve the  general problem like dp[i][j]=math.min(dp[i+1][j],dp[i][j+1])+arr[i][j]
//        8-return the dp[0][0] that is the minimum cost for movement

        //this is the dp which will store the miminum cost
        // arr contains the  cost price for movement
        //we are  solving the small proble so we
        // are traversiing from  last to the top

        //if we are at last row and column at the end
        //we are at last row and last column

        //we are at last row.
        // Last row → can only move right

        //we are at last column
        // Last column → can only move down
        //we are not at last row and last column. so we can right or down

    }

    public static int findMinimumPath_leetcode64(int arr[][]) {

        return 0;
    }
    public static int minimumPathInBig_N_Space(int arr[][])
    {
        //take one d dp array
        return 0;
    }

}




package org.example.memorization;

public class ClimbStairesWithMinimumMove_N0OfMinimumMove {
    public static void main(String str[])
    {
//        1. Problem: We are at the source (index 0) and need to reach the destination (last index).
//        2. Goal: Find the minimum number of moves (jumps) required to reach the destination.
//        3. Create a DP array of size n, where dp[i] stores the minimum number of jumps needed to reach the end from index i.
//        4. Initialize:dp[n-1] = 0, because from the destination we need 0 moves.
//        5. Traverse the array from right to left:
//    for i = n-2 down to 0.
//        6. If arr[i] > 0, it means we can move forward from this index.
//        7. Initialize a variable:
//    min = Integer.MAX_VALUE.
//        8. Run a loop for all possible jumps:
//    for j = 1 to arr[i], and ensure i + j < n:
//        if dp[i + j] is not null:
//        update min = Math.min(min, dp[i + j]).
//        9. After checking all jumps:
//        if min is not Integer.MAX_VALUE:
//    dp[i] = min + 1.
//        10. If no valid jump is found, dp[i] remains null (unreachable).
//        11. Finally, return dp[0] as the answer.
//        12. Time Complexity: O(n²)
//        13. Space Complexity: O(n)


    }
}

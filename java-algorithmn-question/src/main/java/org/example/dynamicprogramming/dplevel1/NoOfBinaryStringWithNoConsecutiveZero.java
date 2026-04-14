package org.example.dynamicprogramming.dplevel1;

public class NoOfBinaryStringWithNoConsecutiveZero {
    public static  void main(String str[])
    {
        // https://www.youtube.com/watch?v=nqrXHJWMeBc&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=18
        int n=6;
        int dp1[]=new int[n+1];
        int dp0[]=new int[n+1];

        noOfBinaryStringWithNoConsecutiveZeroUsingArray(dp0,dp1,n);
    }

    public static void noOfBinaryStringWithNoConsecutiveZeroUsingArray(int zeroArr[],int onearry[],int n)
    {
        zeroArr[1]=1;
        onearry[1]=1;
        for(int i=2;i<=n;i++)
        {
            onearry[i]=onearry[i-1]+zeroArr[i-1];
            zeroArr[i]=onearry[i-1];
        }
System.out.println(onearry[n]+zeroArr[n]);

    }
    public static void noOfBinaryStringWithNoConsecutiveZeroUsingWithVariable(int n)
    {
        // https://www.youtube.com/watch?v=nqrXHJWMeBc&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=18
    }
}

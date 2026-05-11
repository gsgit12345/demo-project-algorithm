package org.example.backtrackingandrecursion;

public class PrintZigZag {
    public static void main(String str[])
    {
        int n=2;
        printRecursion(n);
    }
    public static void printRecursion(int n)
    {
        if(n==0) {
            return ;
        }
        System.out.println("PreOrder"+n);   //2  n=1   2,1
        printRecursion(n-1);
        System.out.println("InOrder"+n); //1,2
        printRecursion(n-1);   //2,1
        System.out.println("PostOrder"+n);


    }
}

package org.example.bitmanipulation;

public class RightMostSetBit {
    public static void main(String str[])
    {
        int n=18;
        int result=n&-n;
        System.out.println("right most set bit:"+result);

        /// one's complement is toggle o into 1 and 1 into 0
        int a=8;
        int re=~8; //one's complement
        System.out.println(re);
    }
}

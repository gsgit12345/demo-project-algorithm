package org.example.backtrackingandrecursion;

public class TowerOfHanoi {
    public static void main(String str[]) {

//        Rules are as below
//            1-Do not move all at once
//            3-Move 1 disk at a time
//            4-Move small disk first
//            5-You can not put the larger disk on smaller

//        "Since the number of moves itself is exponential, we cannot reduce the time " +
//                "complexity below O(2^n). " +
//                Any algorithm must perform at least 2^n - 1 operations."

        int n = 3;
        int t1 = 3;
        int t2 = 4;
        int t3 = 5;

        printAllStep(n, t1, t2, t3);

    }

    public static void printAllStep(int n, int t1, int t2, int t3) {
        if (n == 0) {
            return;
        }
//1-Currently all disk in t1
//2-We have to move in t2
//3-We can take help of t3

        printAllStep(n - 1, t1, t3, t2);
        System.out.println(n + "[" + t1 + "]" + "---" + t2);
        printAllStep(n - 1, t3, t2, t1);

    }

    public static void countTheStep() {

    }

    public static void FindTheKthMove() {

    }

    public static void iterativeTowerOfHanoi() {

    }

    public static void printWhichDiskIsMovedAtFirst() {

    }
}

package org.example.backtrackingandrecursion;

public class PrintAllStairePath {
    public static void main(String str[]) {
        printAllStairePath(4, "");
    }

    public static void printAllStairePath(int n, String path) {
        if (n < 0) {
            return;
        }
        if (n == 0) {
            System.out.println(path);
            return;
        }
        printAllStairePath(n - 1, path + "1");
        printAllStairePath(n - 2, path + "2");
        printAllStairePath(n - 3, path + "2");
    }
}

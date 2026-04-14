package org.example.dynamicprogramming.dplevel1;

public class FillThePlotWithNotTwoBuildingConsecutiveButSpace {
    public static void main(String str[]) {
        //tell the number of way that we can stablish a colony where two building consecutive
        // not allowd but space is allowed.in the plot we can leave the space also
        // https://www.youtube.com/watch?v=0nF-BMYy7tc&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=19
        //two building can not come togather but two space can come togather .
    }

    public static void arrangeTheColony(int n) {
        int bb = 1;
        int space = 1;

        for (int i = 2; i < n; i++) {
            int nbb = space;
            int nspace = space + bb;
            bb = nbb;
            space = nspace;
        }
        int total = space + bb;
        total = total * total;

    }
}

package org.example.graph;

public class Pair implements  Comparable<Pair>{
    int totalWeight;
    String path;


    public Pair(int totalWeight, String path) {
        this.totalWeight = totalWeight;
        this.path = path;
    }

    @Override
    public int compareTo(Pair o) {

        return  this.totalWeight-o.totalWeight;   //basis on the weight kth largest path would be decided
    }
}

package org.example.graph;

public class ShortestPathByweightUsingDijikshetraAlgo {
    static class Paire implements Comparable {
        int src;

        public Paire(int src, int weight, int nbr) {
            this.src = src;
            this.weight = weight;
            this.nbr = nbr;
        }

        int weight;
        int nbr;

        @Override
        public int compareTo(Object ob) {
            Paire p = (Paire) ob;
            return this.weight - p.weight;
        }
    }

    public static void main(String str[] ) {

    }

    public static void createGraph(int vertices) {

    }
}

package org.example.graph;

import java.util.ArrayList;
import java.util.Arrays;

public class GetAllConnectedVerticesinUndirectedGraph {
    public static void main(String str[]) {
        int vertices = 7;

      ArrayList<Edge>[] graph=  createUndirectedWeightedGraph(vertices);
      System.out.println(Arrays.toString(graph));
      boolean[] visited=new boolean[vertices];
        getAllConnectedNode(graph,vertices,visited);
    }

    public static ArrayList<Edge>[] createUndirectedWeightedGraph(int vertices) {
        ArrayList<Edge>[] graph = new ArrayList[vertices];

        int edges[][] = {
                {0, 1},
                {1, 2},
                {1, 3},
                {4, 5},
                {4, 6},
                {5, 6}
        };

        for (int i = 0; i < vertices; i++) {
            graph[i] = new ArrayList<>();
        }
      graph=  addVerticeinUndirectedweightedgraph(graph,edges);
        return graph;
    }

    public static ArrayList<Edge>[] addVerticeinUndirectedweightedgraph(ArrayList<Edge>[] graph, int[][] edge) {

        for (int[] ed : edge) {
            int src = ed[0];
            int nbr = ed[1];
            int weight = 1;
            graph[src].add(new Edge(src, nbr, weight));
            graph[nbr].add(new Edge(nbr, src, weight));
        }

        return graph;
    }

    public static void getAllConnectedNode(ArrayList<Edge>[] graph,int vertices,boolean [] visited)
    {

//        1-run the loop till vertices
//        2-check that vertices visited or not using boolean array.
//        3-If vertices is not visited then call the generatetree function
//        4-after generate tree function add the arraylist in main arraylist.generate tree is returning the arraylist
//        5-in generatetree firstof all mark the src=true in boolean array and add the src in arraylist
//        6-run a for loop and take the edge against a src and put the condition that e.nbr==false
//        7=if  e.nbr is not false then  call the   generatetree recursively


    }
    public static void generateTree(ArrayList<Edge>[] graph )
    {

    }
}

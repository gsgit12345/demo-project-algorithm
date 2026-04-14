package org.example.graph;

import java.util.ArrayList;
import java.util.Arrays;

public class FindPathInGraphUsingDeptFirstApproach {
    public static void main(String str[]) {
        int verteces = 7; //it is node in graph  like   1-----2  so here 1 and 2 are node or verteces
        //  and  -------- is the edge or connection
        ArrayList<Edge>[] graph = new ArrayList[verteces];
        for (int i = 0; i < verteces; i++) {
            graph[i] = new ArrayList<>();
        }

// create the array of edges

        int edges[][] = {
                {0, 1, 10},
                {0, 3, 40},
                {1, 2, 10},
                {2, 3, 10},
                {3, 4, 2},
                {4, 5, 3},
                {5, 6, 3},
                {4, 6, 8}
        };

        for (int edge[] : edges) {
            addEdgesInUndirectedGraph(graph, edge[0], edge[1], edge[2]);
        }

        System.out.println("graph is :  " + Arrays.toString(graph));

        // 0=(1,3)  1 =(0,2) 2={1,3) 3=(0,2,4} 4={3,5} 5={4,6} 6={5,6}

        int source = 0;
        int destination = 6;
        boolean[] isVisited = new boolean[verteces];

       boolean findpath= findThePathfromSourceToDestination(graph, source, destination, isVisited);
       System.out.println("find the path:"+findpath);

    }

    public static void addEdgesInUndirectedGraph(ArrayList<Edge>[] graph, int source, int destination, int weight) {
        graph[source].add(new Edge(source, destination, weight));
        graph[destination].add(new Edge(destination, source, weight));   // this is the undirected graph
// here i am adding the weight so it become undirected weighted graph
    }

    public static void addEdgesInDirectedGraph(ArrayList<Edge>[] graph, int source, int destination, int weight) {
        graph[source].add(new Edge(source, destination, weight));  //this is the directed graph

        //as we are adding the weight so it is also directed weighted graph
    }

    public static boolean findThePathfromSourceToDestination(ArrayList<Edge>[] graph, int source, int desti, boolean[] isVisited) {
        if (source == desti) {
            return true;
        }
        isVisited[source] = true;

        for (Edge edg : graph[source])// Loop is used to try every possible neighbor from src to reach destination.
        {
            if (isVisited[edg.nbr] == false) {
                boolean hasNbrPath = findThePathfromSourceToDestination(graph, edg.nbr, desti, isVisited);

                if (hasNbrPath == true) {
                    return true;
                }
            }
        }

        return false;
    }
}

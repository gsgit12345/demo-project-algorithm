package org.example.graph;

import java.util.ArrayList;

public class IsGraphConnectedinUndirectedGraph {
    public static void main(String str[]) {
        //before this please read the getallconnectedverticesinundirectedGraph
        //it is very simple .you are getting the arraylist of the arraylist in that quetion
        //if every vertices connected to each other then u will find the list size 1
        //if not connected then you will find the size of arraylist greater than 1
        int vertices = 7;
        ArrayList<Edge>[] graph = createGraph(vertices);
        System.out.println("graph is :" + graph);

        ArrayList<ArrayList> allpath = isGraphConnected(graph, vertices);

        System.out.println("alla conned:" + allpath.toString());
        if (allpath.size() == 1) {
            System.out.println("all path is connected");
        } else {
            System.out.println("path is not connected ");
        }
    }

    public static ArrayList<Edge>[] createGraph(int vertices) {
        ArrayList<Edge>[] graph = new ArrayList[vertices];
        for (int i = 0; i < vertices; i++) {
            graph[i] = new ArrayList<>();
        }
        int edges[][] = {
                {0, 1, 10},
                {0, 2, 10}, {0, 3, 10}, {0, 4, 10}, {0, 5, 10}, {0, 6, 10},
                {1, 2, 10}, {1, 3, 10}, {1, 4, 10}, {1, 5, 10}, {1, 6, 10},
                {2, 3, 10}, {2, 4, 10}, {2, 5, 10}, {2, 6, 10},
                {3, 4, 10}, {3, 5, 10}, {3, 6, 10},
                {4, 5, 10}, {4, 6, 10},
                {5, 6, 10}
        };
        for (int[] ed : edges) {
            addEdge(graph, ed[0], ed[1], ed[2]);
        }
        return graph;
    }

    public static void addEdge(ArrayList<Edge>[] graph, int source, int dest, int weight) {
        graph[source].add(new Edge(source, dest, weight));
        graph[dest].add(new Edge(dest, source, weight));
    }

    public static ArrayList<ArrayList> isGraphConnected(ArrayList<Edge>[] graph, int vertices) {

        ArrayList<ArrayList> component = new ArrayList<>();
        boolean[] visited = new boolean[vertices];
        for (int v = 0; v < vertices; v++) {
            if (visited[v] == false) {
                ArrayList<Integer> listofpath = new ArrayList<>();
                traverseAndCollect(graph, v, visited, listofpath);
                component.add(listofpath);

            }
        }

        return component;
    }

    public static ArrayList<Integer> traverseAndCollect(ArrayList<Edge>[] graph, int source, boolean[] visited, ArrayList<Integer> listofpath) {

        visited[source] = true;
        listofpath.add(source);

        for (Edge ed : graph[source])
            if (visited[ed.nbr] == false) {
                traverseAndCollect(graph, ed.nbr, visited, listofpath);
            }
        return listofpath;
    }
}

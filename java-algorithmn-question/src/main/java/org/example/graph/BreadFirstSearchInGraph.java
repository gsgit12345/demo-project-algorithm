package org.example.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class BreadFirstSearchInGraph {
    public static void main(String str[]) {
//        1-create a deque<BreadFirstPaire> and store source or vertices and path
//        2-Create a boolean  array of size of vertices
//        3-create a while loop and put condition deque<BreadFirstPaire>.size >0
//        4-remove from deque and store it
//        5-check if removedeque.vertices is visited or not if visited continue
//        6-marke the remove.deque vertices =true in boolean array and print
//        7-run a for loop within the while loof and fetch the child node from vertices from graph
//        8:- add the child in dequeu but check that nbr is visited or not

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
        int vertice = 7;
        ArrayList<Edge>[] graph = createGraph(vertice, edges);
        boolean[] visited = new boolean[vertice];
        ArrayDeque<BreadFirstPaire> deque = new ArrayDeque<>();
        String path = "0";
        deque.add(new BreadFirstPaire(0, path));
        braetdhFirstSearch(visited, deque, graph);
    }

    public static ArrayList<Edge>[] createGraph(int vertices, int[][] edge) {
        ArrayList<Edge>[] graph = new ArrayList[vertices];

        for (int i = 0; i < vertices; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int ed[] : edge) {
            addEdge(graph, ed[0], ed[1], ed[2]);
        }
        return graph;
    }

    public static void addEdge(ArrayList<Edge>[] graph, int src, int nbr, int w) {
        graph[src].add(new Edge(src, nbr, w));
        graph[nbr].add(new Edge(nbr, src, w));

    }

    public static void braetdhFirstSearch(boolean[] visited, ArrayDeque<BreadFirstPaire> deque, ArrayList<Edge>[] graph) {
        //mark ,remove , work ,
        while (deque.size() > 0) {
            BreadFirstPaire paire = deque.removeFirst();
            if (visited[paire.src] == true) {
                continue;
            }
            visited[paire.src] = true;
            System.out.println(paire.src + "@" + paire.pathsofor);

            for (Edge ed : graph[paire.src]) {
                if (visited[ed.nbr] == false) {
                    deque.add(new BreadFirstPaire(ed.nbr, paire.pathsofor + ed.nbr));
                }
            }
        }
    }

}

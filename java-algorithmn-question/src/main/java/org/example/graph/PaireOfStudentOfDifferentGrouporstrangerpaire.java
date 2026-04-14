package org.example.graph;

import java.util.ArrayList;
import java.util.Arrays;

public class PaireOfStudentOfDifferentGrouporstrangerpaire {

//    Perfect Friends ✅
//    Number of Islands
//    Number of Provinces
//    Count Unreachable Pairs
//    Max Area of Island

    public static void main(String str[]) {
//        You are given:
//    Students = nodes
//        Some students are in the same group (connected)
//👉 Task:
//    Find number of pairs of students who are from different groups
//        Inside same group → connected ❌ not allowed
//        Between groups → NOT connected ✅ allowed
//        Calculate total stranger pairs

        //int vertices = 7;  //ans 14
      // int  vertices = 1;    // ans 0
       int vertices = 8;   //23
        ArrayList<Edge>[] graph = createGraph(vertices);
        System.out.println("edges:" + Arrays.toString(graph));

        calculateStrangePaire(graph, vertices);

    }

    public static ArrayList<Edge>[] createGraph(int vertices) {
        ArrayList<Edge>[] graph = new ArrayList[vertices];

        for (int i = 0; i < vertices; i++) {
            graph[i] = new ArrayList<>();
        }
        //int edge[][] = {{0, 1}, {1, 2}, {2, 3}, {4, 5}};
     //  int[][] edge = {};
        int [][]edge = {{0,1},{2,3},{3,4},{5,6}};

        for (int ed[] : edge) {
            addEdge(graph, ed[0], ed[1], 1);
        }
        return graph;
    }

    public static void addEdge(ArrayList<Edge>[] graph, int src, int dest, int weigh) {
        graph[src].add(new Edge(src, dest, weigh));
        graph[dest].add(new Edge(dest, src, weigh));
    }

    public static void calculateStrangePaire(ArrayList<Edge>[] graph, int vertices) {

        boolean[] visited = new boolean[vertices];
        ArrayList<ArrayList> allgroupfreind = new ArrayList<>();
        for (int v = 0; v < vertices; v++) {
            ArrayList<Integer> arr = new ArrayList<>();
            if (visited[v] == false) {
                arr = getAllFreindGroup(graph, v, visited, arr);
                allgroupfreind.add(arr);
            }
        }
        int total = 0;
        for (int i = 0; i < allgroupfreind.size(); i++) {
            for (int j = i + 1; j < allgroupfreind.size(); j++) {
                int count = allgroupfreind.get(i).size() * allgroupfreind.get(j).size();
                total += count;

            }
        }
        System.out.println(total);
    }

    public static ArrayList<Integer> getAllFreindGroup(ArrayList<Edge>[] graph, int v, boolean[] visited, ArrayList<Integer> arr) {
        visited[v] = true;
        arr.add(v);

        for (Edge e : graph[v]) {
            if (visited[e.nbr] == false) {
                getAllFreindGroup(graph, e.nbr, visited, arr);
            }
        }

        return arr;
    }
}

package org.example.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class FindKPathInGraphUsingDFS {
    public static void main(String str[]) {
        ArrayList<Edge>[] graph = constructUndirectedGraphWithWeight();

        System.out.println("graph is:" + Arrays.toString(graph));
        int verteces = 7;
        int k = 3;
        boolean[] visited = new boolean[verteces];
        int psf=0;
        int wsf=0;
        PriorityQueue<Pair> queue = new PriorityQueue();
        int dest = graph.length - 1;
       // Answer = 0→1→2→3→4→6 @ 40
        findKLargestpathInGraph(graph,
                0,
                dest,
                visited,
                "0",
                0,
                k,
                queue);
        if(!queue.isEmpty())
        {
            Pair p=queue.remove();
            System.out.println("p is ::"+p.path+":total path:"+p.totalWeight);
        }
    }

    public static void findKLargestpathInGraph(ArrayList<Edge>[] graph,
                                               int src,
                                               int dest,
                                               boolean[] visited,
                                               String psf,
                                               int wsf,
                                               int k,
                                               PriorityQueue<Pair> queue){
        // No weight → count edges
        // Weight present → sum weights

        if (src == dest) {

            // Kth largest path
            if (queue.size() < k) {
                queue.add(new Pair(wsf, psf));
            } else {
                if (wsf > queue.peek().totalWeight) {
                    queue.remove();
                    queue.add(new Pair(wsf, psf));
                }
            }

            return ;
        }

        visited[src] = true;
        for (Edge ed : graph[src]) {
            if (visited[ed.nbr] == false) {
                findKLargestpathInGraph(graph,
                        ed.nbr,
                        dest,
                        visited,
                        psf + "->" + ed.nbr,
                        wsf + ed.weight,
                        k,
                        queue);
            }
        }
        visited[src] = false;

    }

    public static ArrayList<Edge>[] constructUndirectedGraphWithWeight() {
        int verteces = 7;
        ArrayList<Edge>[] graph = new ArrayList[verteces];
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
        for (int i = 0; i < verteces; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edg : edges) {
            addEdgeinUndirectedWeightedGraph(graph, edg[0], edg[1], edg[2]);
        }
        return graph;
    }

    public static void addEdgeinUndirectedWeightedGraph(ArrayList<Edge>[] graph, int source, int destination, int weight) {
        graph[source].add(new Edge(source, destination, weight));
        graph[destination].add(new Edge(destination, source, weight));//remove it if there is weighted graph
    }
}

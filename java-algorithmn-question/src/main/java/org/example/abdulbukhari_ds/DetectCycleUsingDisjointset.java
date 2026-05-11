package org.example.abdulbukhari_ds;

public class DetectCycleUsingDisjointset {
    public static  int parent[];
    static int rank[] ;
    //u can use size when you want to provide solution using size
    static int size[];
    public static void main(String str[]) {
//        1-Note:-here rank is storing approximate height (depth) of tree
//          2-👉 parent[i] stores: who is the parent of node i which node i points to or
//            parent = manager
        // It works for undirected graph but not directed graph.
        //1-Cyclic detection can be solved useing two way a-using rank 2-Using size
        //2-Create parent array (n+1) and rank array(n+1)  or size array(n+1)
        //3-Run a loop from 0 to n and fill the array =i  and rank=0 and if size with 1 in the loop
        //4-create a find() and write the logic of find function
        //  a-find function logic
        //   b- put a if condition and check that parent[x] !x or not if condition satisfy
        //    c= parent[x]=find(parent[x])
        //    d-return the parent[k] at the last
        // 1- write the union logic
        // 1-get the a nd b element from the edge[0] and edge[1] in the edge loop
//         2-if find(a) ==find(b)   the return from here .furtor we have to arrange the tree like we have to add
//         bigger tree

        int length=3;
        parent=new int[3];

        int edges[][] = {

                {1, 2},
                {2, 3},
                {3, 4},
                {1, 3}
        };
    }

    public static boolean detectCyclicInUndirectedGraph(int edges[][])
    {

        return false ;
    }
    public static void union(int a,int b)
    {

    }
    public static  int find(int a)
    {
return 0;
    }
}

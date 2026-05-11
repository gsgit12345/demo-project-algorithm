package org.example.abdulbukhari_ds;

public class DisJointSet {
    int[] parent;
    int rank[];

    DisJointSet(int num) {
        parent = new int[num];
        rank = new int[num];
        for (int i = 0; i < num; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public int find(int k) {
        if (parent[k] != k) {
            parent[k] = find(parent[k]);
        }
        return parent[k];
    }

    public void union(int set1, int set2) {
        int roota = find(set1);
        int rootb = find(set2);
        if (roota == rootb) return;

        // attach smaller rank tree under larger rank tree
        //👉 rank approximately means:  height of tree
        if (rank[roota] < rank[rootb]) {
            parent[roota] = rootb;
        } else if (rank[roota] > rank[rootb]) {
            parent[rootb] = roota;
        } else {
            parent[rootb] = roota;
            rank[roota]++;
        }

    }

    public boolean connected(int set1, int set2) {
        return find(set1) == find(set2);

    }

    public void printParents() {
        for (int i = 0; i < parent.length; i++) {
            System.out.print(parent[i] + " ");
        }
        System.out.println();
    }


    public static void main(String str[]) {
        DisJointSet ds = new DisJointSet(8);

        ds.union(1, 2);
        ds.union(2, 3);
        ds.union(4, 5);

        System.out.println(ds.connected(1, 3)); // true
        System.out.println(ds.connected(1, 5)); // false

        ds.union(3, 5);

        System.out.println(ds.connected(1, 5)); // true

        ds.printParents(); // see structure


    }
}

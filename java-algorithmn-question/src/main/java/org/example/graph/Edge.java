package org.example.graph;

public class Edge {
    @Override
    public String toString() {
        return "Edge{" +
                "src=" + src +
                ", nbr=" + nbr +
                ", weight=" + weight +
                '}';
    }
   public  Edge()
    {

    }
    public int getSrc() {
        return src;
    }

    public void setSrc(int src) {
        this.src = src;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    int src;  //it is source in graph
    int nbr;  // it is a neighbor or destination
    int weight;  // this is the weight in graph

    public Edge(int src,int nbr,int weight)
    {
        this.src=src;
        this.nbr=nbr;
        this.weight=weight;
    }
    public int getNbr() {
        return nbr;
    }

    public void setNbr(int nbr) {
        this.nbr = nbr;
    }

}

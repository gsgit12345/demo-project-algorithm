package org.example.graph;

public class BreadFirstPaire {
    int src;

    @Override
    public String toString() {
        return "BreadFirstPaire{" +
                "src=" + src +
                ", pathsofor='" + pathsofor + '\'' +
                '}';
    }

    String pathsofor;

    public BreadFirstPaire(int src, String pathsofor) {
        this.src = src;
        this.pathsofor = pathsofor;
    }


    public int getSrc() {
        return src;
    }

    public void setSrc(int src) {
        this.src = src;
    }

    public String getPathsofor() {
        return pathsofor;
    }

    public void setPathsofor(String pathsofor) {
        this.pathsofor = pathsofor;
    }

}

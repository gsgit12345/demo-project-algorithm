package org.example.binarytree;

public class Paire {
    int state;

    @Override
    public String toString() {
        return "Paire{" +
                "state=" + state +
                ", node=" + node +
                '}';
    }

    Node node;
    public Paire(Node node,int state)
    {
        this.state=state;
        this.node=node;
    }
}

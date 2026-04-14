package org.example.generictree;

import java.util.ArrayList;
import java.util.List;

public class GenericNode {
    public int data;

    @Override
    public String toString() {
        return "GenericNode{" +
                "data=" + data +
                ", children=" + children +
                '}';
    }

    public List<GenericNode> children = new ArrayList<>();

    public GenericNode() {

    }

    public GenericNode(GenericNode node) {
        this.data = node.data;
    }
    public GenericNode(int data)
    {
        this.data=data;
    }
}

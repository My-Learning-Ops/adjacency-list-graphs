package org.example;

import java.util.*;

/**
 * A generic implementation of a Graph using an adjacency list
 */
public class Graph<T> {

    // Adjacency list to store the graph
    private Map<T, List<T>> adjacencyList;

    // Conbstructs a graph with an empty adjacency list
    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

}
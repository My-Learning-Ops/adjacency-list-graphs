package org.example;

import java.util.*;

/**
 * A generic implementation of a Graph using an adjacency list
 */
public class Graph<T> {

    // Adjacency list to store the graph
    private Map<T, List<T>> adjacencyList;

    // Constructs a graph with an empty adjacency list
    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    /**
     * Adds a node to the graph
     * 
     * @param node The node of generic type to be added to the graph
     */
    public void addNode(T node) {
        // Add a new node to the graph if it doesn't already exist
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }

    

}
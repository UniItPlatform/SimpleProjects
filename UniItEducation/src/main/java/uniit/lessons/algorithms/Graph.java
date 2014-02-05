/*
 * Copyright (c) 2014 UniItPlatform.
 */
package uniit.lessons.algorithms;

/**
 * Graph-interface description
 *
 * @author Sidikov Marsel
 * @version 1.0 2/4/14
 */
public interface Graph {

    /**
     * Tests if this Graph is connected.
     * @return <code>true</code>, if this <code>Graph</code> is connected; <code>false</code> otherwise.
     */
    boolean isConnected();

    boolean isComplete();

    boolean isAdjacent(int vertexA, int vertexB);

    void addEdge(int vertexA, int vertexB, int weightOfEdge);

    void addVertex(int vertex);

    void deleteVertex(int vertex);

    int getCountOfEdges();

    int getCountOfVertices();

    int getOutDegreeOfVertex(int vertex);

    int getInDegreeOfVertex(int vertex);

    Iterable<Integer> getAdjacentVertices(int vertex);
}

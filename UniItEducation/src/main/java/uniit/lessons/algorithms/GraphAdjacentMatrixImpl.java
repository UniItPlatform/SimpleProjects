/*
 * Copyright (c) 2014 UniItPlatform.
 */
package uniit.lessons.algorithms;

/**
 * GraphAdjacentMatrixImpl-class description
 *
 * @author Sidikov Marsel
 * @version 1.0 2/4/14
 */
public class GraphAdjacentMatrixImpl implements Graph {

    double[][] matrix;

    private static final double NOT_EDGE = Double.NEGATIVE_INFINITY;

    private int currentCountOfVertices;

    public GraphAdjacentMatrixImpl(int maxCountOfVertices) {
        this.matrix = new double[maxCountOfVertices][maxCountOfVertices];
        this.currentCountOfVertices = 0;
    }

    public boolean isNoEdge(int v1, int v2) {
        return matrix[v1][v2] == NOT_EDGE;
    }

    @Override
    public boolean isConnected() {
        return false;
    }

    @Override
    public boolean isComplete() {
        return false;
    }

    @Override
    public boolean isAdjacent(int vertexA, int vertexB) {
        return false;
    }

    @Override
    public void addEdge(int vertexA, int vertexB, int weightOfEdge) {
        if ((vertexA < this.currentCountOfVertices) || (vertexB < this.currentCountOfVertices)) {
            this.matrix[vertexA][vertexB] = weightOfEdge;
            this.currentCountOfVertices++;
        } else {


        }

    }

    @Override
    public void addVertex(int vertex) {

    }

    @Override
    public void deleteVertex(int vertex) {

    }

    @Override
    public int getCountOfEdges() {
        return 0;
    }

    @Override
    public int getCountOfVertices() {
        return 0;
    }

    @Override
    public int getOutDegreeOfVertex(int vertex) {
        return 0;
    }

    @Override
    public int getInDegreeOfVertex(int vertex) {
        return 0;
    }

    @Override
    public Iterable<Integer> getAdjacentVertices(int vertex) {
        return null;
    }
}

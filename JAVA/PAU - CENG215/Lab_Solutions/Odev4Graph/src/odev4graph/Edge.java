/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev4graph;

/**
 *
 * @author tee
 */
public class Edge<T> {
    Vertex<T> from;
    Vertex<T> to;
    int weight;

    public Edge(Vertex<T> from, Vertex<T> to) {
        this.from = from;
        this.to = to;
        weight=1;
    }

    public Edge(Vertex<T> from, Vertex<T> to, int weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }
}

package algoritms.graph;

import java.util.LinkedList;
import java.util.List;

public class Node<T> {
    private T value;
    private List<Node> adjacent = new LinkedList<>();

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public List<Node> getAdjacent() {
        return new LinkedList<>(adjacent);
    }

    public void addAdjacent(Node node) {
        adjacent.add(node);
    }
}

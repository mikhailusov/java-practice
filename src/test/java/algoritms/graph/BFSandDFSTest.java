package algoritms.graph;

import org.junit.Test;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class BFSandDFSTest {

    @Test
    public void hasPath() {
        Node node = new Node("A");
        Node node1 = new Node("B");
        Node node2 = new Node("C");
        Node node3 = new Node("D");
        Node node4 = new Node("E");
        Node node5 = new Node("F");
        Node node6 = new Node("G");
        node.addAdjacent(node1);
        node.addAdjacent(node2);
        node2.addAdjacent(node6);
        node3.addAdjacent(node4);
        node1.addAdjacent(node5);

        assertTrue(BreadthFirstSearch.hasPath(node, node6));
        assertTrue(BreadthFirstSearch.hasPath(node, node5));
        assertFalse(BreadthFirstSearch.hasPath(node, node4));
        assertFalse(BreadthFirstSearch.hasPath(node1, node));

        assertTrue(DepthFirstSearch.hasPath(node, node6));
        assertTrue(DepthFirstSearch.hasPath(node, node5));
        assertFalse(DepthFirstSearch.hasPath(node, node4));
        assertFalse(DepthFirstSearch.hasPath(node1, node));
    }
}
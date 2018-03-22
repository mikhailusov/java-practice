package datastructures;

/**
 * Data structure with following operations in O(1) time:
 * add(element)
 * getLast()
 * removeLast()
 * getMin()
 *
 */
public class MinStack<E extends Comparable> {

    private Node<E> last;

    public void add(E element) {
        Node<E> node = new Node<>(element);
        node.prev = last;
        if (last == null) {
            node.min = element;
        } else if (last.min.compareTo(element) < 0) {
            node.min = last.min;
        } else {
            node.min = element;
        }

        last = node;
    }

    public boolean removeLast() {
        if (last == null) {
            return false;
        }
        last = last.prev;
        return true;
    }

    public E getLast() {
        return last == null ? null : last.value;
    }

    public E getMin() {
        return last == null ? null : last.min;
    }

    private class Node<E> {
        public E value;
        public Node prev;
        public E min;

        public Node(E value) {
            this.value = value;
        }
    }
}

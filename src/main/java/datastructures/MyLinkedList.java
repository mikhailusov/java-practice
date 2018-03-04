import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<E> extends AbstractSequentialList<E> implements List<E> {

    private ListNode head;
    private ListNode tail;
    private int size;

    public MyLinkedList() {
        this.head = new ListNode();
        this.tail = new ListNode();
        this.head.next = this.tail;
        this.tail.prev = this.head;
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        if (this.size == 0) {
            return false;
        }

        ListNode currentNode = this.head.next;

        while(currentNode.next.next != null) {
            if (currentNode.element.equals(o)) {
                return true;
            }
            currentNode = currentNode.next;
        }

        return false;
    }

    /**
     * Adds element E to the end of the linked list
     *
     * @param e
     * @return
     */
    @Override
    public boolean add(E e) {
        ListNode newTail = new ListNode();
        newTail.prev = this.tail;

        this.tail.element = e;
        this.tail.next = newTail;

        this.tail = newTail;

        return true;
    }

    /**
     * Removes first occurrence in linked list
     *
     * @param o
     * @return
     */
    @Override
    public boolean remove(Object o) {
        if (this.size == 0) {
            return false;
        }

        ListNode currentNode = this.head.next;

        while (currentNode.next.next != null) {
            if (currentNode.element.equals(o)) {

                currentNode.prev.next = currentNode.next;
                currentNode.next.prev = currentNode.prev;

                this.size--;

                return true;
            }
            currentNode = currentNode.next;
        }

        return false;
    }

    @Override
    public void clear() {
        this.head = new ListNode();
        this.tail = new ListNode();
        this.size = 0;
    }

    @Override
    public E get(int index) {
        if (this.size <= index) {
            return null;
        }

        ListNode currentNode = this.head.next;

        for (int i = 0; currentNode.next.next != null; i++) {
            if (i == index) {
                return currentNode.element;
            }
            currentNode = currentNode.next;
        }

        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    /**
     * Retrieves but does not remove the first element of linked list
     *
     * @return E element
     */
    public E peek() {
        if (this.size == 0) {
            return null;
        }
        return head.next.element;
    }

    /**
     * Retrieves but does not remove the last element of linked list
     *
     * @return E element
     */
    public E peekLast() {
        if (this.size == 0) {
            return null;
        }
        return tail.prev.element;
    }

    /**
     * Retrieves and remove the first element of linked list
     *
     * @return E element
     */
    public E poll() {
        if (this.size == 0) {
            return null;
        }
        E first = this.head.next.element;

        this.head.next = this.head.next.next;
        this.head.next.prev = this.head;
        this.size--;

        return first;
    }

    /**
     * Retrieves and remove the last element of linked list
     *
     * @return E element
     */
    public E pollLast() {
        if (this.size == 0) {
            return null;
        }
        E last = this.tail.prev.element;

        this.tail.prev = this.tail.prev.prev;
        this.tail.prev.next = this.tail;
        this.size--;

        return last;

    }

    private class ListNode {
        private E element;
        private ListNode prev;
        private ListNode next;

        public ListNode() {
            new ListNode(null, null, null);
        }

        public ListNode(E element, ListNode prev, ListNode next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }
}
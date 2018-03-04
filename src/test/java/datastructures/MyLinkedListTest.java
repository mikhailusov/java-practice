package datastructures;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class MyLinkedListTest {

    @Test
    public void createEmptyLinkedList() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        assertEquals(0, myLinkedList.size());
        assertNull(myLinkedList.peek());
        assertNull(myLinkedList.peekLast());
        assertNull(myLinkedList.poll());
        assertNull(myLinkedList.pollLast());
        assertTrue(myLinkedList.isEmpty());
        assertFalse(myLinkedList.contains(""));
        assertFalse(myLinkedList.remove(""));
    }

    @Test
    public void size() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("");
        myLinkedList.add("a");
        myLinkedList.add("b");
        assertEquals(3, myLinkedList.size());
        assertEquals("", myLinkedList.poll());
        assertEquals(2, myLinkedList.size());
        assertEquals("b", myLinkedList.pollLast());
        assertEquals(1, myLinkedList.size());
        assertTrue(myLinkedList.remove("a"));
        assertEquals(0, myLinkedList.size());
    }

    @Test
    public void remove() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("");
        myLinkedList.add("a");
        myLinkedList.add("b");
        assertTrue(myLinkedList.contains(""));
        assertTrue(myLinkedList.remove(""));
        assertFalse(myLinkedList.contains(""));
        assertEquals(2, myLinkedList.size());
        assertFalse(myLinkedList.remove("c"));
        assertEquals(2, myLinkedList.size());
    }

    @Test
    public void contains() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("");
        myLinkedList.add("a");
        myLinkedList.add("b");
        assertTrue(myLinkedList.contains(""));
        assertTrue(myLinkedList.contains("a"));
        assertTrue(myLinkedList.contains("b"));
        assertFalse(myLinkedList.contains("c"));
        assertEquals("", myLinkedList.poll());
        assertFalse(myLinkedList.contains(""));
        assertEquals("b", myLinkedList.pollLast());
        assertFalse(myLinkedList.contains("b"));
        assertTrue(myLinkedList.contains("a"));
        assertFalse(myLinkedList.contains(new Integer(1)));
    }

    @Test
    public void clear() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("a");
        myLinkedList.add("a");
        myLinkedList.add("a");
        assertEquals(3, myLinkedList.size());
        myLinkedList.clear();
        assertEquals(0, myLinkedList.size());
    }

    @Test
    public void get() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("a");
        myLinkedList.add("b");
        myLinkedList.add("c");
        assertEquals("c", myLinkedList.get(2));
        assertEquals("a", myLinkedList.get(0));
        assertNull(myLinkedList.get(4));
        assertEquals("a", myLinkedList.poll());
        assertEquals("b", myLinkedList.poll());
        assertEquals("c", myLinkedList.poll());
        assertNull(myLinkedList.get(0));
    }

}
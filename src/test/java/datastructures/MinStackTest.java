package datastructures;

import org.junit.Test;
import java.util.Optional;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class MinStackTest {


    @Test
    public void getAddAndRemoveLast() {
        MinStack<Integer> minStack = new MinStack<>();
        minStack.add(1);
        minStack.add(2);
        minStack.add(3);
        assertEquals(Optional.ofNullable(3), Optional.ofNullable(minStack.getLast()));
        minStack.removeLast();
        assertEquals(Optional.ofNullable(2), Optional.ofNullable(minStack.getLast()));
        minStack.removeLast();
        assertEquals(Optional.ofNullable(1), Optional.ofNullable(minStack.getLast()));
        minStack.removeLast();
        assertNull(null, minStack.getLast());
        minStack.removeLast();
        assertNull(null, minStack.getLast());
    }

    @Test
    public void getMin() {
        MinStack<Integer> minStack = new MinStack<>();
        assertNull(minStack.getMin());
        minStack.add(11);
        minStack.add(12);
        minStack.add(13);
        assertEquals(Optional.ofNullable(11), Optional.ofNullable(minStack.getMin()));
        minStack.add(9);
        assertEquals(Optional.ofNullable(9), Optional.ofNullable(minStack.getMin()));
        minStack.removeLast();
        assertEquals(Optional.ofNullable(11), Optional.ofNullable(minStack.getMin()));
        minStack.removeLast();
        minStack.removeLast();
        assertEquals(Optional.ofNullable(11), Optional.ofNullable(minStack.getMin()));
        minStack.removeLast();
        assertNull(minStack.getMin());
    }
}
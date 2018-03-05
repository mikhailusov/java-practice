package algoritms.search;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class BinarySearchTest {

    @Test
    public void search() {
        assertEquals(0, (int) BinarySearch.search(new int[]{-3,-1,1,5,55,122}, -3));
        assertEquals(3, (int) BinarySearch.search(new int[]{-3,-1,1,5,55,122}, 5));
        assertEquals(5, (int) BinarySearch.search(new int[]{-3,-1,1,5,55,122}, 122));
        assertEquals(0, (int) BinarySearch.search(new int[]{5}, 5));
        assertNull(BinarySearch.search(new int[]{-3,-1,1,5,55,122}, 6));
        assertNull(BinarySearch.search(new int[]{}, 6));
        assertNull(BinarySearch.search(new int[]{1,5,9}, 6));
    }
}
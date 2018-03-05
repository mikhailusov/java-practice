package algoritms.sort;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SelectionSortTest {

    @Test
    public void sort() {
        assertArrayEquals(new int[]{1, 2, 3}, SelectionSort.sort(new int[]{3, 2, 1}));
        assertArrayEquals(new int[]{}, SelectionSort.sort(new int[]{}));
        assertArrayEquals(new int[]{1}, SelectionSort.sort(new int[]{1}));
        assertArrayEquals(new int[]{1, 1, 1, 5}, SelectionSort.sort(new int[]{1, 5, 1, 1}));
    }
}
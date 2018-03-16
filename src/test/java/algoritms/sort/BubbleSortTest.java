package algoritms.sort;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void sort() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, BubbleSort.sort(new int[]{2, 4, 1, 3, 5}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, BubbleSort.sort(new int[]{5, 4, 3, 2, 1}));
    }
}
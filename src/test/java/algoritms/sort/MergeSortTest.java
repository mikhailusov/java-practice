package algoritms.sort;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {

    @Test
    public void sort() {
        assertArrayEquals(new int[]{}, MergeSort.sort(new int[]{}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, MergeSort.sort(new int[]{4, 3, 1, 5, 2}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, MergeSort.sort(new int[]{5, 4, 3, 2, 1}));
        assertArrayEquals(new int[]{1, 1, 1, 4, 5}, MergeSort.sort(new int[]{4, 1, 1, 5, 1}));
        assertArrayEquals(new int[]{1, 2, 2, 2, 3}, MergeSort.sort(new int[]{2, 3, 1, 2, 2}));
    }
}
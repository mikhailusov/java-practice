package problems.sorting;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class MergeSortedArraysTest {

    @Test
    public void merge() {
        assertArrayEquals(new int[]{1,2,3,4,5}, MergeSortedArrays.merge(new int[]{1,3,5,0,0}, 3, new int[]{2,4}, 2));
        assertArrayEquals(new int[]{}, MergeSortedArrays.merge(new int[]{}, 0, new int[]{}, 0));
        assertArrayEquals(new int[]{1,2,4,5,6}, MergeSortedArrays.merge(new int[]{1,0,0,0,0}, 1, new int[]{2,4,5,6}, 4));
        assertArrayEquals(new int[]{1,2,4,5,6}, MergeSortedArrays.merge(new int[]{1,5,6,0,0}, 3, new int[]{2,4}, 2));
    }
}
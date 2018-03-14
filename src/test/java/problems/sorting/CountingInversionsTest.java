package problems.sorting;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CountingInversionsTest {

    @Test
    public void countInversions() {
        assertEquals(0, CountingInversions.countInversions(new int[]{1, 1, 1, 2, 2}));
        assertEquals(0, CountingInversions.countInversions(new int[]{}));
        assertEquals(1, CountingInversions.countInversions(new int[]{2, 1}));
        assertEquals(3, CountingInversions.countInversions(new int[]{3, 2, 1}));
        assertEquals(4, CountingInversions.countInversions(new int[]{2, 1, 3, 1, 2}));
        assertEquals(5, CountingInversions.countInversions(new int[]{2, 1, 3, 2, 1}));
        assertEquals(10, CountingInversions.countInversions(new int[]{5, 4, 3, 2, 1}));
    }
}
package problems.dp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaximumSubarrayTest {

    @Test
    public void max() {
        assertEquals(Integer.MIN_VALUE, MaximumSubarray.max(new int[]{}));
        assertEquals(-1, MaximumSubarray.max(new int[]{-1}));
        assertEquals(0, MaximumSubarray.max(new int[]{0}));
        assertEquals(1, MaximumSubarray.max(new int[]{1}));
        assertEquals(6, MaximumSubarray.max(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        assertEquals(0, MaximumSubarray.max(new int[]{-2,-1,0}));
        assertEquals(6, MaximumSubarray.max(new int[]{1,2,3}));
        assertEquals(100, MaximumSubarray.max(new int[]{-100,100}));
        assertEquals(299, MaximumSubarray.max(new int[]{-100,100,199}));
        assertEquals(1, MaximumSubarray.max(new int[]{0,1,0}));
    }
}
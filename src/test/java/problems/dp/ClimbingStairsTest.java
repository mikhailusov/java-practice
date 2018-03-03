package problems.dp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ClimbingStairsTest {

    @Test
    public void climb() {
        assertEquals(1, ClimbingStairs.climb(-99));
        assertEquals(1, ClimbingStairs.climb(-1));
        assertEquals(1, ClimbingStairs.climb(0));
        assertEquals(1, ClimbingStairs.climb(1));
        assertEquals(2, ClimbingStairs.climb(2));
        assertEquals(5, ClimbingStairs.climb(4));
        assertEquals(8, ClimbingStairs.climb(5));
        assertEquals(89, ClimbingStairs.climb(10));
        assertEquals(144, ClimbingStairs.climb(11));
        assertEquals(-1109825406, ClimbingStairs.climb(50));
        assertEquals(-1869596475, ClimbingStairs.climb(100));
    }
}
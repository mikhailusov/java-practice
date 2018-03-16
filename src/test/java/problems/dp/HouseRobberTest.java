package problems.dp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HouseRobberTest {

    @Test
    public void rob() {
        assertEquals(23, HouseRobber.rob(new int[]{2, 3, 5, 9, 4, 7, 11}));
        assertEquals(63, HouseRobber.rob(new int[]{2, 3, 5, 9, 4, 7, 11, 1, 35, 33, 5, 4}));
        assertEquals(19, HouseRobber.rob(new int[]{2, 3, 5, 9, 4, 7}));
        assertEquals(2, HouseRobber.rob(new int[]{2}));
        assertEquals(3, HouseRobber.rob(new int[]{3}));
        assertEquals(0, HouseRobber.rob(new int[]{}));
    }
}
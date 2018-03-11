package problems.array;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class ArrayQuadrupletTest {

    @Test
    public void findArrayQuadruplet() {
        assertArrayEquals(new int[]{}, ArrayQuadruplet.findArrayQuadruplet(new int[]{}, 20));
        assertArrayEquals(new int[]{}, ArrayQuadruplet.findArrayQuadruplet(new int[]{4, 4, 4}, 4));
        assertArrayEquals(new int[]{}, ArrayQuadruplet.findArrayQuadruplet(new int[]{4, 4, 4, 4}, 4));
        assertArrayEquals(new int[]{}, ArrayQuadruplet.findArrayQuadruplet(new int[]{4, 4, 4, 2}, 16));
        assertArrayEquals(new int[]{4, 4, 4, 4}, ArrayQuadruplet.findArrayQuadruplet(new int[]{4, 4, 4, 4}, 16));
        assertArrayEquals(new int[]{}, ArrayQuadruplet.findArrayQuadruplet(new int[]{2,7,4,0,9,5,1,3}, 120));
        assertArrayEquals(new int[]{4, 5, 12, 19}, ArrayQuadruplet.findArrayQuadruplet(new int[]{1, 2, 3, 4, 5, 9, 19, 12, 12, 19}, 40));
        assertArrayEquals(new int[]{1, 2, 3, 4}, ArrayQuadruplet.findArrayQuadruplet(new int[]{1, 2, 3, 4, 5}, 10));
        assertArrayEquals(new int[]{1, 1, 3, 6}, ArrayQuadruplet.findArrayQuadruplet(new int[]{1, 1, 3, 4, 7, 6, 5}, 11));
    }
}
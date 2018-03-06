package algoritms.array;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class LeftRotationTest {

    @Test
    public void rotate() {
        // edge cases
        assertArrayEquals(new int[]{1, 2, 3}, LeftRotation.rotate(new int[]{1,2,3}, 3, -1));
        assertArrayEquals(new int[]{1, 2, 3}, LeftRotation.rotate(new int[]{1,2,3}, 3, 0));
        assertArrayEquals(new int[]{}, LeftRotation.rotate(new int[]{}, 0, 3));
        // base cases
        assertArrayEquals(new int[]{5,1,2,3,4}, LeftRotation.rotate(new int[]{1,2,3,4,5}, 5, 4));
        assertArrayEquals(new int[]{5,1,2,3,4}, LeftRotation.rotate(new int[]{1,2,3,4,5}, 5, 14));
        assertArrayEquals(new int[]{4,5,1,2,3}, LeftRotation.rotate(new int[]{1,2,3,4,5}, 5, 3));
        assertArrayEquals(new int[]{6,7,1,2,3,4,5}, LeftRotation.rotate(new int[]{1,2,3,4,5,6,7}, 7, 5));
        assertArrayEquals(new int[]{1,2,3,4,5,6,7}, LeftRotation.rotate(new int[]{1,2,3,4,5,6,7}, 7, 7));
        assertArrayEquals(new int[]{1,2,3,4,5,6,7}, LeftRotation.rotate(new int[]{1,2,3,4,5,6,7}, 7, 14));
        assertArrayEquals(new int[]{1,2,3,4,5,6,7}, LeftRotation.rotate(new int[]{1,2,3,4,5,6,7}, 7, 21));
    }
}
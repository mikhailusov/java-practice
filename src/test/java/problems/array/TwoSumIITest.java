package problems.array;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class TwoSumIITest {

    @Test
    public void twoSum() {
        assertArrayEquals(new int[]{1,2}, TwoSumII.twoSum(new int[]{1,2,5,7,8}, 3));
        assertArrayEquals(new int[]{6, 7}, TwoSumII.twoSum(new int[]{1,2,5,7,8,9,11}, 20));
        assertArrayEquals(new int[]{2, 3}, TwoSumII.twoSum(new int[]{1,2,5,7,8,9,11}, 7));
    }
}
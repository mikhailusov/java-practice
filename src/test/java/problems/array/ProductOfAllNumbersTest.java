package problems.array;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class ProductOfAllNumbersTest {

    @Test
    public void getProductsOfAllIntsExceptAtIndex() {
        assertArrayEquals(new int[]{540, 270, 90, 108, 60}, ProductOfAllNumbers.getProductsOfAllIntsExceptAtIndex(new int[]{1, 2, 6, 5, 9}));
        assertArrayEquals(new int[]{84, 12, 28, 21}, ProductOfAllNumbers.getProductsOfAllIntsExceptAtIndex(new int[]{1, 7, 3, 4}));
        assertArrayEquals(new int[]{}, ProductOfAllNumbers.getProductsOfAllIntsExceptAtIndex(new int[]{}));
    }
}
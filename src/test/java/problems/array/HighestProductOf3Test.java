package problems.array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HighestProductOf3Test {

    @Test
    public void findProduct() {
        assertEquals(3, HighestProductOf3.findProduct(new int[]{1, 1, 3}));
        assertEquals(0, HighestProductOf3.findProduct(new int[]{1, 1, 0}));
        assertEquals(45, HighestProductOf3.findProduct(new int[]{1, 3, 3, 5, 2}));
    }
}
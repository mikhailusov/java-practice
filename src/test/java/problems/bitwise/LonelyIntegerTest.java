package problems.bitwise;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LonelyIntegerTest {

    @Test
    public void findUnique() {
        assertEquals(2, LonelyInteger.findUnique(new int[]{1,1,3,3,4,4,4,4,2}));
        assertEquals(10, LonelyInteger.findUnique(new int[]{2,10,2}));
        assertEquals(10, LonelyInteger.findUnique(new int[]{2,10,2,5,5,5,5}));
    }
}
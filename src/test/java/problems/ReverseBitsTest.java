package problems;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReverseBitsTest {

    @Test
    public void testReverse() {
        assertEquals(0, ReverseBits.reverse(0));
        assertEquals(-2147483648, ReverseBits.reverse(1));
        assertEquals(964176192, ReverseBits.reverse(43261596));
    }

}
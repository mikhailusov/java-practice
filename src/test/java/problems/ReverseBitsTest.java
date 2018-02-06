package problems;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseBitsTest {

    private ReverseBits reverseBits;

    @BeforeEach
    void setUp() {
        this.reverseBits = new ReverseBits();
    }

    @Test
    public void testReverse() {
        assertEquals(0, reverseBits.reverse(0));
        assertEquals(Integer.MAX_VALUE, reverseBits.reverse(1));
        assertEquals(964176192, reverseBits.reverse(43261596));
    }

}
package problems.array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ArrayIndexAndElementEqualityTest {

    @Test
    public void indexEqualsValueSearch() {
        assertEquals(1, ArrayIndexAndElementEquality.indexEqualsValueSearch(new int[]{-2,1,2,3,4,7,8}));
        assertEquals(0, ArrayIndexAndElementEquality.indexEqualsValueSearch(new int[]{0,1,2,3,4,7,8}));
        assertEquals(3, ArrayIndexAndElementEquality.indexEqualsValueSearch(new int[]{-2,0,1,3,4,7,8}));
        assertEquals(5, ArrayIndexAndElementEquality.indexEqualsValueSearch(new int[]{-2,-1,0,1,3,5,8}));
        assertEquals(-1, ArrayIndexAndElementEquality.indexEqualsValueSearch(new int[]{-2,-1,0,1,3,6,8}));
        assertEquals(-1, ArrayIndexAndElementEquality.indexEqualsValueSearch(new int[]{}));
        assertEquals(-1, ArrayIndexAndElementEquality.indexEqualsValueSearch(new int[]{2}));
        assertEquals(-1, ArrayIndexAndElementEquality.indexEqualsValueSearch(new int[]{2,5}));
    }
}
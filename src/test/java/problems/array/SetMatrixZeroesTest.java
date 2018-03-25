package problems.array;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SetMatrixZeroesTest {

    @Test
    public void setZeroes() {
        int[][] result = SetMatrixZeroes.setZeroes(new int[][]{{0,0,0,1},{0,1,2,3},{0,1,2,3},{1,2,3,4}});
        assertArrayEquals(new int[]{0,0,0,0}, result[0]);
        assertArrayEquals(new int[]{0,0,0,0}, result[1]);
        assertArrayEquals(new int[]{0,0,0,0}, result[2]);
        assertArrayEquals(new int[]{0,0,0,4}, result[3]);
    }
}
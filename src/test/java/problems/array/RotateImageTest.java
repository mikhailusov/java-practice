package problems.array;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class RotateImageTest {

    @Test
    public void rotate() {
        assertArrayEquals(new int[]{3, 1}, RotateImage.rotate(new int[][]{{1, 2}, {3, 4}})[0]);
        assertArrayEquals(new int[]{4, 2}, RotateImage.rotate(new int[][]{{1, 2}, {3, 4}})[1]);
        assertArrayEquals(new int[]{}, RotateImage.rotate(new int[][]{{}})[0]);
        assertArrayEquals(new int[]{7, 4, 1}, RotateImage.rotate(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})[0]);
        assertArrayEquals(new int[]{8, 5, 2}, RotateImage.rotate(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})[1]);
        assertArrayEquals(new int[]{9, 6, 3}, RotateImage.rotate(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})[2]);
    }
}
package problems.array;

/**
 * from leetcode.com
 * <p>
 * You are given an n x n 2D matrix representing an image.
 * Rotate the image by 90 degrees (clockwise).
 * <p>
 * Note:
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
 * DO NOT allocate another 2D matrix and do the rotation.
 * <p>
 * <p>
 * Easier and better understood solution
 * <p>
 * The idea was firstly transpose the matrix and then flip it symmetrically. For instance,
 * 1  2  3
 * 4  5  6
 * 7  8  9
 * after transpose, it will be swap(matrix[i][j], matrix[j][i])
 * 1  4  7
 * 2  5  8
 * 3  6  9
 * <p>
 * Then flip the matrix horizontally. (swap(matrix[i][j], matrix[i][matrix.length-1-j])
 * 7  4  1
 * 8  5  2
 * 9  6  3
 */


public class RotateImage {

    public static int[][] rotate(int[][] matrix) {

        // transpose
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // flip horizontally
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }

        return matrix;
    }
}

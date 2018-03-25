package problems.array;

/**
 * from leetcode.com
 *
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
 */
public class SetMatrixZeroes {

    public static int[][] setZeroes(int[][] matrix) {
        // remember what rows we have set to 0s
        int[] rowsZeros = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rowsZeros[i] = 1;
                }
            }
        }
        // put cols to 0s
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = 0; k < matrix.length; k++) {
                        matrix[k][j] = 0;
                    }
                }
            }
        }
        // put rows to 0s
        for (int i = 0; i < rowsZeros.length; i++) {
            if (rowsZeros[i] == 1) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }
}

package problems.array;

/**
 * from facebook.com
 *
 * Find the pattern and complete the function:
 * int[][] spiral(int n);
 * where n is the size of the 2D array.
 *
 * input = 3
 * 123
 * 894
 * 765
 *
 * input = 4
 * 01 02 03 04
 * 12 13 14 05
 * 11 16 15 06
 * 10 09 08 07
 *
 * input = 8
 * 1 2 3 4 5 6 7 8
 * 28 29 30 31 32 33 34 9
 * 27 48 49 50 51 52 35 10
 * 26 47 60 61 62 53 36 11
 * 25 46 59 64 63 54 37 12
 * 24 45 58 57 56 55 38 13
 * 23 44 43 42 41 40 39 14
 * 22 21 20 19 18 17 16 15
 */
public class SpiralArray2D {

    public static int[][] spiral(int n) {
        if (n < 1) {
            return new int[0][];
        }

        int[][] matrix = new int[n][n];

        int i = 0;
        int j = 0;
        int num = 1;

        while (num <= n * n) {

        }

        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printMatrix(spiral(3));
    }
}
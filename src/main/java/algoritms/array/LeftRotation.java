package algoritms.array;

/**
 * from hackerrank.com
 *
 * A left rotation operation on an array of size  shifts each of the array's elements  unit to the left.
 * For example, if 2 left rotations are performed on array [1,2,3,4,5], then the array would become [3,4,5,1,2].
 * Given an array of  integers and a number, d, perform d left rotations on the array.
 * Then print the updated array as a single line of space-separated integers.
 *
 */
public class LeftRotation {

    /**
     *
     * @param a array of int to rotate
     * @param n int size of array a
     * @param k int rotations count
     * @return int[] array rotated
     */
    public static int[] rotate(int[] a, int n, int k) {
        if (n < 1 || k < 1 || k % n == 0 || k < 1 || a.length < 2) {
            return a;
        }

        k = k % n;

        int b[] = a.clone();

        for (int i = 0, j = 0; i < n; i++) {
            if (i+k < n) {
                a[i] = a[i+k];
            } else {
                a[i] = b[j];
                j++;
            }
        }

        return a;
    }
}

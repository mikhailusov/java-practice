package problems.bitwise;

import java.util.Arrays;

/**
 * from hackerrank.com
 *
 * You will be given an array of integers. All of the integers except one occur twice. That one is unique in the array.
 * Given an array of integers, find and print the unique element.
 * It is guaranteed that  is an odd number and that there is one unique element.
 */
public class LonelyInteger {

    public static int findUnique(int[] nums) {
        return Arrays.stream(nums).reduce(0, (x, y) -> x ^ y);
    }
}

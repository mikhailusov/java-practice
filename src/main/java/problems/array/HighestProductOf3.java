package problems.array;

import java.util.Arrays;

/**
 * from interviewcake.com
 *
 * Given an array of integers, find the highest product you can get from three of the integers.
 * The input arrayOfInts will always have at least three integers.
 */
public class HighestProductOf3 {

    public static int findProduct(int[] nums) {
        if (nums == null || nums.length < 3) {
            throw new IllegalArgumentException();
        }

        Arrays.sort(nums);
        int n = nums.length;

        return nums[n - 1] * nums[n - 2] * nums[n - 3];
    }
}

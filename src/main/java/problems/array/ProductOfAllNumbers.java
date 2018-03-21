package problems.array;

/**
 * from interviewcake.com
 *
 * You have an array of integers, and for each index you want to find the product of every integer except the integer at
 * that index.
 *
 * Write a method getProductsOfAllIntsExceptAtIndex() that takes an array of integers and returns an array of the products.
 * For example, given:
 * [1, 7, 3, 4]
 * your method would return:
 * [84, 12, 28, 21]
 * by calculating:
 * [7 * 3 * 4,  1 * 3 * 4,  1 * 7 * 4,  1 * 7 * 3]
 * Do not use division in your solution.
 */
public class ProductOfAllNumbers {

    public static int[] getProductsOfAllIntsExceptAtIndex(int[] nums) {
        int[] prod = new int[nums.length];

        int prodSoFar = 1;
        for (int i = 0; i < nums.length; i++) {
            prod[i] = prodSoFar;
            prodSoFar *= nums[i];
        }

        prodSoFar = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            prod[i] *= prodSoFar;
            prodSoFar *= nums[i];
        }

        return prod;
    }
}

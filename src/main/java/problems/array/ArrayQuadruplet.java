package problems.array;

import java.util.Arrays;

/**
 * from pramp.com
 *
 * Given an unsorted array of integers arr and a number s, write a function findArrayQuadruplet that finds four numbers
 * (quadruplet) in arr that sum up to s. Your function should return an array of these numbers in an ascending order.
 * If such a quadruplet doesn’t exist, return an empty array.
 *
 * Note that there may be more than one quadruplet in arr whose sum is s. You’re asked to return the first one you
 * encounter (considering the results are sorted).
 */
public class ArrayQuadruplet {

    public static int[] findArrayQuadruplet(int[] arr, int s) {
        if (arr.length < 4) {
            return new int[0];
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 3; i++) {
            for (int j = i+1; j < arr.length - 2; j++) {

                int low = j + 1;
                int high = arr.length - 1;

                while (low <= high) {
                    int sum = arr[i] + arr[j] + arr[low] + arr[high];

                    if (sum - s == 0) {
                        return new int[]{arr[i], arr[j], arr[low], arr[high]};
                    } else if (sum - s > 0) {
                        high--;
                    } else {
                        low++;
                    }

                }
            }
        }

        return new int[0];
    }
}

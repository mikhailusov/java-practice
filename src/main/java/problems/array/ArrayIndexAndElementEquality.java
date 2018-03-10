package problems.array;


/**
 * from pramp.com
 *
 * Given a sorted array arr of distinct integers, write a function indexEqualsValueSearch that returns the lowest
 * index i for which arr[i] == i.
 * Return -1 if there is no such index.
 */
public class ArrayIndexAndElementEquality {

    static int indexEqualsValueSearch(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int min = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == mid && (min < 0 || min > mid)) {
                min = mid;
                high = mid - 1;
                continue;
            }

            if (arr[mid] > mid) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        return min;
    }
}

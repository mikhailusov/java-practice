package problems.sorting;

/**
 * from hackerrank.com
 * <p>
 * In an array, arr = [arr[0], arr[1], ..., arr[n-1]] , the elements at indices i and j (where i < j) form an inversion
 * if arr[i] > arr[j]. In other words, inverted elements arr[i] and arr[j] are considered to be "out of order".
 * To correct an inversion, we can swap adjacent elements.
 * <p>
 * For example, consider arr = [2, 3, 4]. It has two inversions: (2, 1) and (4, 1). To sort the array, we must perform the following
 * two swaps to correct the inversions:
 * <p>
 * Given d datasets, print the number of inversions that must be swapped to sort each dataset on a new line.
 */
public class CountingInversions {

    private static int[] temp;
    private static long swaps;

    public static long countInversions(int[] arr) {
        temp = new int[arr.length];
        swaps = 0L;
        countInversions(arr, 0, arr.length - 1);
        return swaps;
    }

    private static void countInversions(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;
        countInversions(arr, low, mid);
        countInversions(arr, mid + 1, high);
        merge(arr, low, high);
    }

    private static void merge(int[] arr, int low, int high) {
        int mid = (low + high) / 2;

        int left = low;
        int right = mid + 1;
        int index = low;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[index] = arr[left];
                left++;
            } else {
                temp[index] = arr[right];
                right++;
                swaps += mid - left + 1;
            }
            index++;
        }


        while (left <= mid) {
            temp[index] = arr[left];
            left++;
            index++;
        }


        while (right <= high) {
            temp[index] = arr[right];
            right++;
            index++;
        }

        System.arraycopy(temp, low, arr, low, high - low + 1);
    }
}

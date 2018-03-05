package algoritms.search;

/**
 * Binary Search implementation
 *
 * @author Mikhail Usov <musovx@gmail.com>
 */
public class BinarySearch {

    /**
     * @param nums sorted array of integers
     * @param x int number to search
     * @return Integer index of found element or null if not found
     */
    public static Integer search(int[] nums, int x) {
       Integer index = null;

       int low  = 0;
       int high = nums.length - 1;

       while (low <= high) {
           int mid = (low + high) / 2;
           if (nums[mid] == x) {
               index = mid;
               break;
           }
           if (nums[mid] > x) {
               high = mid - 1;
           } else {
               low = mid + 1;
           }

       }

       return index;
    }
}

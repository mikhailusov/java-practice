package algoritms.sort;

/**
 * Selection sort implementation
 *
 */
public class SelectionSort {

    public static int[] sort(int[] nums) {
        if (nums.length < 2) {
            return nums;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            int index = i;

            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[index]) {
                    index = j;
                }
            }

            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }

        return nums;
    }
}

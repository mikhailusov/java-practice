package algoritms.sort;

public class MergeSort {

    private static int[] temp;

    public static int[] sort(int[] array) {
        if (array == null) {
            return array;
        }

        temp = new int[array.length];

        sort(array, 0, array.length - 1);
        return temp;
    }

    private static void sort(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;

        sort(array, low, mid);
        sort(array, mid + 1, high);
        merge(array, low, high);
    }

    private static void merge(int[] array, int low, int high) {
        int mid   = (low + high) / 2;
        int left  = low;
        int right = mid + 1;
        int index = low;

        while (left <= mid && right <= high) {
            if (array[left] <= array[right]) {
                temp[index] = array[left];
                left++;
            } else {
                temp[index] = array[right];
                right++;
            }
            index++;
        }

        while (left <= mid) {
            temp[index] = array[left];
            left++;
            index++;
        }

        while (right <= high) {
            temp[index] = array[right];
            right++;
            index++;
        }

        System.arraycopy(temp, low, array, low, high - low + 1);
    }
}

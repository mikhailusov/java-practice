package algoritms.sort;

public class BubbleSort {

    public static int[] sort(int[] array) {
        boolean sorted = false;
        int size = array.length - 1;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < size; i++) {
                if (array[i] > array[i+1]) {
                    int tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                    sorted = false;
                }
            }
            size--;
        }

        return array;
    }
}

package problems.bitwise;

import java.util.Arrays;

/**
 * there is 8 horses represented by 8 numbers, each is either 0 or 1
 * every day horses competes to others
 * if neigbors are equals number becames 1
 * if they are differnet number becames 0
 * for first and last assume they other neigbor is always 0
 * compare intial state before it changed
 *
 * [1,0,1,1,0,0,0,0], 1
 * [1,1,0,0,0,1,1,1], 2
 * [0,0,0,1,0,0,1,0]
 */
public class Horses {

    public static int[] compete(int[] horses, int days) {
        while (days > 0) {
            int prev = 0;
            for (int i = 0; i < horses.length - 1; i++) {
                int temp = horses[i];
                horses[i] = (prev ^ horses[i + 1]) ^ 1;
                prev = temp;
            }
            horses[7] = prev ^ 1;
            days--;
        }
        return horses;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(compete(new int[]{1,0,1,1,0,0,0,0}, 1)));
        System.out.println(Arrays.toString(compete(new int[]{1,0,1,1,0,0,0,0}, 2)));
        System.out.println(Arrays.toString(compete(new int[]{1,0,1,1,0,0,0,0}, 3)));
        System.out.println(Arrays.toString(compete(new int[]{1,0,1,1,0,0,0,0}, 4)));
        System.out.println(Arrays.toString(compete(new int[]{1,0,1,1,0,0,0,0}, 5)));
        System.out.println(Arrays.toString(compete(new int[]{1,0,1,1,0,0,0,0}, 6)));
    }
}

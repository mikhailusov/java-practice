package problems.dp;

/**
 * from leetcode.com
 *
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Note: Given n will be a positive integer.
 *
 */
public class ClimbingStairs {

    public static int climb(int n) {
        if (n < 2) return 1;

        int d[] = new int[n+1];
        d[0] = 1;
        d[1] = 1;

        for (int i = 2; i <= n; i++) {
            d[i] = d[i-1] + d[i-2];
        }

        return d[n];
    }
}

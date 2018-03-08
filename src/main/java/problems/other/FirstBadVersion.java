package problems.other;

/**
 * from leetcode.com
 *
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version
 * of your product fails the quality check. Since each version is developed based on the previous version, all the
 * versions after a bad version are also bad.
 *
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following
 * ones to be bad.
 *
 * You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to
 * find the first bad version. You should minimize the number of calls to the API.
 */
public class FirstBadVersion {

    private int badVersion;

    public FirstBadVersion(int badVersion) {
        this.badVersion = badVersion;
    }

    protected void setBadVersion(int badVersion) {
        this.badVersion = badVersion;
    }

    public int firstBadVersion(int n) {
        if (n < 1) {
            return n;
        }

        if (isBadVersion(1)) {
            return 1;
        }

        int low = 1;
        int high = n;

        while (low <= high) {
            int mid  = low + ((high - low) / 2);

            if (isBadVersion(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;

    }

    private boolean isBadVersion(int n) {
        return n >= badVersion;
    }
}

package problems.trees;

/**
 * from leetcode.com
 *
 * Given a binary tree, find the length of the longest path where each node in the path has the same value. This path
 * may or may not pass through the root.
 *
 * Note: The length of path between two nodes is represented by the number of edges between them.
 */
public class LongestUnivaluePath {

    private static int max;

    public static int longestUnivaluePath(TreeNode root) {
        if (root == null) {
            return 0;
        }

        longest(root, root.val);

        return max;
    }

    private static int longest(TreeNode root, int val) {
        if (root == null) {
            return 0;
        }

        int left  = longest(root.left, root.val);
        int right = longest(root.right, root.val);

        max = Math.max(max, left + right);

        if (root.val == val) {
            return Math.max(left, right) + 1;
        }

        return 0;
    }
}

package problems.trees;

import java.util.Arrays;


/**
 * from leetcode.com
 *
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 *
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees
 * of every node never differ by more than 1.
 */
public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length < 1) {
            return null;
        }

        if (nums.length == 1) {
            TreeNode node = new TreeNode(nums[0]);
            return node;
        }

        int h = nums.length / 2;

        TreeNode root = new TreeNode(nums[h]);

        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, h));

        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, h+1, nums.length));

        return root;
    }
}

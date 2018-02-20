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
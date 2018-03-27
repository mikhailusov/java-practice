package problems.trees;

import org.junit.Test;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class IsBalancedTreeTest {

    @Test
    public void isBalanced() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        assertTrue(IsBalancedTree.isBalanced(root));
        root.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(5);
        assertFalse(IsBalancedTree.isBalanced(root));
    }
}
package problems.trees;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MinDepthTest {

    @Test
    public void minDepth() {
        TreeNode root = new TreeNode(1);
        assertEquals(1, MinDepth.minDepth(root));
        root.left = new TreeNode(2);
        assertEquals(2, MinDepth.minDepth(root));
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);
        assertEquals(2, MinDepth.minDepth(root));
        root.left.left = new TreeNode(5);
        assertEquals(3, MinDepth.minDepth(root));
    }
}
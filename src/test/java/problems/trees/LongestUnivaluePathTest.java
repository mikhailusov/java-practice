package problems.trees;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LongestUnivaluePathTest {

    @Test
    public void longestUnivaluePath() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        assertEquals(1, LongestUnivaluePath.longestUnivaluePath(root));
    }
}
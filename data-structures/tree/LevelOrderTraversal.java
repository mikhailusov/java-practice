package tree;

import java.util.LinkedList;
import java.util.List;

public class LevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        int i = 0;
        List<Integer> level = getLevel(root, 0);
        while (!level.isEmpty()) {
            list.add(level);
            level = getLevel(root, ++i);
        }
        return list;
    }

    private static List<Integer> getLevel(TreeNode root, int lvl) {
        List<Integer> list = new LinkedList<>();
        return getLevel(root, lvl, list);
    }

    private static List<Integer> getLevel(TreeNode root, int lvl, List<Integer> list) {
        if (root == null) return list;

        if (lvl == 0) {
            list.add(root.val);
            return list;
        }

        getLevel(root.left, lvl-1, list);
        getLevel(root.right, lvl-1, list);
        return list;
    }

    private class TreeNode {
        private int val;
        private TreeNode left;
        private TreeNode right;
    }
}

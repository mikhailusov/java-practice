package algoritms.tree;

import java.util.ArrayList;
import java.util.List;

public class NTreeInorderTraversal {

    private List<Integer> list = new ArrayList<>();

    public List<Integer> preorder(NTreeNode root) {
        if (root == null) return list;

        list.add(root.getValue());

        for (NTreeNode node: root.getChildren()) {
            preorder(node);
        }

        return list;
    }
}

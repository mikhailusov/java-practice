package algoritms.tree;

import java.util.List;

public class NTreeNode {
    private int value;
    private List<NTreeNode> children;

    public NTreeNode(int value, List<NTreeNode> children) {
        this.value = value;
        this.children = children;
    }

    public List<NTreeNode> getChildren() {
        return children;
    }

    public int getValue() {
        return value;
    }
}

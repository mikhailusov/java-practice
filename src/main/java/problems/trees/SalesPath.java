package problems.trees;

/**
 * from pramp.com
 *
 * The car manufacturer Honda holds their distribution system in the form of a tree (not necessarily binary). The root
 * is the company itself, and every node in the tree represents a car distributor that receives cars from the parent
 * node and ships them to its children nodes. The leaf nodes are car dealerships that sell cars direct to consumers.
 * In addition, every node holds an integer that is the cost of shipping a car to it.
 *
 * A path from Honda’s factory to a car dealership, which is a path from the root to a leaf in the tree, is called a
 * Sales Path. The cost of a Sales Path is the sum of the costs for every node in the path. For example, in the tree
 * above one Sales Path is 0→3→0→10, and its cost is 13 (0+3+0+10).
 *
 * Honda wishes to find the minimal Sales Path cost in its distribution tree. Given a node rootNode, write an function
 * getCheapestCost that calculates the minimal Sales Path cost in the tree.
 */
public class SalesPath {

    static int getCheapestCost(Node root) {
        if (root == null) {
            return 0;
        }

        if (root.children == null) {
            return root.cost;
        } else {
            int cost;
            int min = Integer.MAX_VALUE;
            for (Node child: root.children) {
                cost = getCheapestCost(child);
                min = Math.min(cost, min);
            }
            return min + root.cost;
        }
    }

    private static class Node {
        public int cost;
        public Node[] children;
    }
}

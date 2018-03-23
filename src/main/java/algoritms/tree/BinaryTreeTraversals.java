package algoritms.tree;

import problems.trees.TreeNode;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeTraversals {

    private static TreeNode tree;

    public static void preOrderRecursive(TreeNode root) {
        if (root == null) {
            return;
        }
        print(root);
        preOrderRecursive(root.left);
        preOrderRecursive(root.right);
    }

    public static void preOrderIterative(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            print(node);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }

        }
    }

    public static void inOrderRecursive(TreeNode root) {
        if (root == null) {
            return;
        }

        inOrderRecursive(root.left);
        print(root);
        inOrderRecursive(root.right);
    }

    public static void inOrderIterative(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;

        while (node != null) {
            stack.push(node);
            node = node.left;
        }

        while (!stack.isEmpty()) {
            node = stack.pop();
            print(node);
            if (node.right != null) {
                node = node.right;
                while (node != null) {
                    stack.push(node);
                    node = node.left;
                }
            }
        }
    }

    public static void postOrderRecursive(TreeNode root) {
        if (root == null) {
            return;
        }

        postOrderRecursive(root.left);
        postOrderRecursive(root.right);
        print(root);
    }

    public static void postOrderIterative(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        stack1.push(root);

        while (!stack1.empty()) {
            TreeNode node = stack1.pop();
            stack2.push(node);
            if (node.left != null) {
                stack1.push(node.left);
            }
            if (node.right != null) {
                stack1.push(node.right);
            }
        }

        while (!stack2.isEmpty()) {
            print(stack2.pop());
        }
    }

    public static void levelOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            print(node);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
    }

    public static void main(String[] args) {
        // pre-orders
        preOrderRecursive(generateTree());
        System.out.println();
        preOrderIterative(generateTree());

        System.out.println();
        System.out.println();

        // in-orders
        inOrderRecursive(generateTree());
        System.out.println();
        inOrderIterative(generateTree());

        System.out.println();
        System.out.println();

        // post-orders
        postOrderRecursive(generateTree());
        System.out.println();
        postOrderIterative(generateTree());

        System.out.println();
        System.out.println();

        // level-order
        levelOrder(generateTree());
    }

    /**
     *     5
     *   /   \
     *  3     6
     * / \     \
     * 2  1     7
     *
     */
    private static TreeNode generateTree() {
        if (tree != null) {
            return tree;
        }
        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(6);
        TreeNode node5 = new TreeNode(7);

        root.left = node1;
        root.right = node4;
        node1.left = node2;
        node1.right = node3;
        node4.right = node5;

        return root;
    }

    private static void print(TreeNode node) {
        System.out.print(node.val + " ");
    }
}

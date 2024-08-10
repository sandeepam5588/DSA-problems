package TreesAndGraphs;

 class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}

public class HeightBalancedTree {
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) {
            return -1; // Not balanced
        }

        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) {
            return -1; // Not balanced
        }

        if (Math.abs(leftHeight + rightHeight) > 1) {
            return -1; // Not balanced
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        // Create a balanced binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        // Create an unbalanced binary tree
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.left.left = new TreeNode(3);

        HeightBalancedTree tree = new HeightBalancedTree();

        System.out.println("Is the first tree balanced? " + tree.isBalanced(root)); // Output: true
        System.out.println("Is the second tree balanced? " + tree.isBalanced(root2)); // Output: false
    }
}


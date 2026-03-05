import cs125.trees.BinaryTree;

public class BinaryTreeBalanced {
    
    public static boolean isBalanced(BinaryTree tree) {
        if (tree == null) {
            throw new IllegalArgumentException();
        }
        return isBalancedHelper(tree);
    }

    // main entry point to start the recursion
    // used so that i can handle null as a valid base case
    private static boolean isBalancedHlper(BinaryTree tree) {
        if (tree == null) {
            return true;
        }

        int leftHeight = getHeight(tree.getLeft());
        int rightHeight = getHeight(tree.getRight());
        
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }

        return isBalancedHelper(tree.getLeft()) && isBalancedHelper(tree.getRight());
    }
    
    // second helper method implementing tree height that i can call in my primary recursive method
    private static int getHeight(BinaryTree tree) {
        if (tree == null) {
            return 0;
        }

        return 1 + Math.max(getHeight(tree.getLeft()), getHeight(tree.getRight()));
    }
}